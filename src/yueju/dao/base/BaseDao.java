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
	//根据命名查询语句查询,只能执行查询语句
	public List<T> findByNamedQuery(String queryName,Object...args);
	//执行命名的增删改语句
	public void executeByNamedQuery(String queryName,Object...args);
	//根据离线条件查询对象查询
	public List<T> findByCriteria(DetachedCriteria dc);
	//通用分页查询
	public void pageQuery(PageBean<T> pageBean);
}
