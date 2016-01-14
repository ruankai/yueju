package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.NewsDao;
import yueju.dao.TopicDao;
import yueju.dao.UserDao;
import yueju.domain.News;
import yueju.domain.Topic;
import yueju.page.PageBean;
import yueju.service.NewsService;

@Entity
@Service
@Transactional
public class NewsServiceImpl implements NewsService {


	@ManyToOne
	@Autowired
	private NewsDao newsDao;
	
	public void pageQuery(PageBean<News> pageBean) {
		// TODO Auto-generated method stub

	}

	public News findNewsById(Long id) {
		// TODO Auto-generated method stub
		return newsDao.findById(id);
	}

	public List<News> findAllNews() {
		// TODO Auto-generated method stub
		List<News> list = newsDao.findAll();
        return list;
	}

}
