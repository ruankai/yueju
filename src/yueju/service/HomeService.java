package yueju.service;

import java.util.List;

import yueju.domain.News;
import yueju.service.page.PagableService;
import yueju.domain.Infopush;

public interface HomeService extends PagableService<News> {
 
	public List<News> findNews();

	public List<Infopush> findinfopush();
}
