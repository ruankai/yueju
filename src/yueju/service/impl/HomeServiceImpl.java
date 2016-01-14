package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import yueju.dao.InfopushDao;
import yueju.dao.NewsDao;
import yueju.domain.Infopush;
import yueju.domain.News;
import yueju.page.PageBean;
import yueju.service.HomeService;
@Entity
@Service
@Transactional
public class HomeServiceImpl implements HomeService {

	
	@Autowired
	private NewsDao newsDao;
	

	@Autowired
	private InfopushDao infopusDao;


	public List<News> findNews() {
		// TODO Auto-generated method stub
		return newsDao.findAll();
	}

	public void pageQuery(PageBean<News> pageBean) {
		 newsDao.pageQuery(pageBean);
		
	}


	public List<Infopush> findinfopush() {
		// TODO Auto-generated method stub
		return infopusDao.findAll();
	}

}