package yueju.service.page;

import yueju.page.PageBean;

public interface PagableService<T> {
	public void pageQuery(PageBean<T> pageBean);
}
