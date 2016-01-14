package yueju.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import yueju.page.PageBean;


public interface BaseDao<T> {
	public void save(T entity);
	public void delete(T entity);
	public void update(T entity);
	public void saveOrUpdate(T entity);
	public T findById(Serializable id);
	public List<T> findAll();
	//����������ѯ����ѯ,ֻ��ִ�в�ѯ���
	public List<T> findByNamedQuery(String queryName,Object...args);
	//ִ����������ɾ�����
	public void executeByNamedQuery(String queryName,Object...args);
	//��������������ѯ�����ѯ
	public List<T> findByCriteria(DetachedCriteria dc);
	//ͨ�÷�ҳ��ѯ
	public void pageQuery(PageBean<T> pageBean);
}