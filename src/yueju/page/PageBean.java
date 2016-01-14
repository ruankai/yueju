package yueju.page;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.criterion.DetachedCriteria;

/**
 * 封装分页信息
 * @author zhaoqx
 *
 */
@Entity
public class PageBean<T> {
	/**分页查询条件*/
	private int page;//当前页码
	private int pageSize;//查询记录数 
	private DetachedCriteria detachedCriteria;//查询条件
	
	/**分页查询结果*/
	private long total;//总记录数
	private List<T> rows;//数据
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public DetachedCriteria getDetachedCriteria() {
		return detachedCriteria;
	}
	public void setDetachedCriteria(DetachedCriteria detachedCriteria) {
		this.detachedCriteria = detachedCriteria;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
