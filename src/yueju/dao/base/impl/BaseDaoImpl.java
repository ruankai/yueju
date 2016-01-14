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
	// 实体类型
	private Class<T> entityClass;
	
	//注入SessionFactory对象
	@Resource//(name="")   jdk提供注解
	//@Autowired   spring提供注解
	public void setSF(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	// 通过在构造方法中动态获得实体类型
	public BaseDaoImpl() {
		// 获得父类（BaseDaoImpl）类型
		ParameterizedType genericSuperclass = (ParameterizedType) this
				.getClass().getGenericSuperclass();
		//获得父类上的泛型数组
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		//取数组第一个元素
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
		String hql = "FROM " + entityClass.getSimpleName();// 注意空格
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
				query.setParameter(i++, arg);//为？赋值
			}
		}
		query.executeUpdate();
	}

	public void pageQuery(PageBean<T> pageBean) {
		int page = pageBean.getPage();
		int pageSize = pageBean.getPageSize();
		//查询条件对象
		DetachedCriteria detachedCriteria = pageBean.getDetachedCriteria();
		
		//查询总记录数
		//hibernate发出select count(*) ....
		detachedCriteria.setProjection(Projections.rowCount());
		List list = this.getHibernateTemplate().findByCriteria(detachedCriteria);
		long total = (Long) list.get(0);
		//将sql发出变为select * ....
		detachedCriteria.setProjection(null);
		//结果集重置，将从staff表中查询的数据包装为Staff对象
		detachedCriteria.setResultTransformer(DetachedCriteria.ROOT_ENTITY);
		
		//分页查询，当前页的数据
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
