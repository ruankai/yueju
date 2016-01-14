package yueju.service;

import java.util.List;


import yueju.domain.News;
import yueju.domain.Topic;
import yueju.service.page.PagableService;

public interface NewsService extends PagableService<News> {

	public News findNewsById(Long id);
	public List<News> findAllNews();	
}
