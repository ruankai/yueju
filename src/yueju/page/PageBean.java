package yueju.page;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.criterion.DetachedCriteria;

/**
 * ��װ��ҳ��Ϣ
 * @author zhaoqx
 *
 */
@Entity
public class PageBean<T> {
	/**��ҳ��ѯ����*/
	private int page;//��ǰҳ��
	private int pageSize;//��ѯ��¼�� 
	private DetachedCriteria detachedCriteria;//��ѯ����
	
	/**��ҳ��ѯ���*/
	private long total;//�ܼ�¼��
	private List<T> rows;//����
	
	
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