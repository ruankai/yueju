package yueju.dao.base.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import javax.persistence.Entity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import yueju.dao.base.BaseDao;
import yueju.page.PageBean;


@Entity
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
	// ʵ������
	private Class<T> entityClass;
	
	//ע��SessionFactory����
	@Resource//(name="")   jdk�ṩע��
	//@Autowired   spring�ṩע��
	public void setSF(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	// ͨ���ڹ��췽���ж�̬���ʵ������
	public BaseDaoImpl() {
		// ��ø��ࣨBaseDaoImpl������
		ParameterizedType genericSuperclass = (ParameterizedType) this
				.getClass().getGenericSuperclass();
		//��ø����ϵķ�������
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		//ȡ�����һ��Ԫ��
		entityClass = (Class<T>) actualTypeArguments[0];
	}

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	public void delete(T entity) {
		this.getHibernateTemplate().delete(entity);
	}

	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}

	public T findById(Serializable id) {
		return this.getHibernateTemplate().get(entityClass, id);
	}

	public List<T> findAll() {
		String hql = "FROM " + entityClass.getSimpleName();// ע��ո�
		return this.getHibernateTemplate().find(hql);
	}

	public List<T> findByNamedQuery(String queryName, Object... args) {
		return this.getHibernateTemplate().findByNamedQuery(queryName, args);
	}

	public List<T> findByCriteria(DetachedCriteria dc) {
		return this.getHibernateTemplate().findByCriteria(dc);
	}

	public void executeByNamedQuery(String queryName, Object... args) {
		Session session = this.getSession();
		Query query = session.getNamedQuery(queryName);
		if(args != null){
			int length = args.length;
			int i = 0;
			for (Object arg : args) {
				query.setParameter(i++, arg);//Ϊ����ֵ
			}
		}
		query.executeUpdate();
	}

	public void pageQuery(PageBean<T> pageBean) {
		int page = pageBean.getPage();
		int pageSize = pageBean.getPageSize();
		//��ѯ��������
		DetachedCriteria detachedCriteria = pageBean.getDetachedCriteria();
		
		//��ѯ�ܼ�¼��
		//hibernate����select count(*) ....
		detachedCriteria.setProjection(Projections.rowCount());
		List list = this.getHibernateTemplate().findByCriteria(detachedCriteria);
		long total = (Long) list.get(0);
		//��sql������Ϊselect * ....
		detachedCriteria.setProjection(null);
		//��������ã�����staff���в�ѯ�����ݰ�װΪStaff����
		detachedCriteria.setResultTransformer(DetachedCriteria.ROOT_ENTITY);
		
		//��ҳ��ѯ����ǰҳ������
		int firstResult = (page - 1) * pageSize;
		int maxResults = pageSize;
		List<T> rows = this.getHibernateTemplate().findByCriteria(detachedCriteria, firstResult, maxResults);
		
		pageBean.setTotal(total);
		pageBean.setRows(rows);
	}

	public void saveOrUpdate(T entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
	}
}