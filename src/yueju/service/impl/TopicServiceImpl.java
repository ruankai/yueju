package yueju.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.common.Page;
import yueju.dao.NewsDao;
import yueju.dao.TopicDao;
import yueju.dao.UserDao;
import yueju.domain.Topic;
import yueju.page.PageBean;
import yueju.service.TopicService;

@Entity
@Service
@Transactional
public class TopicServiceImpl implements TopicService {

	@ManyToOne
	@Autowired
	private TopicDao topicDao;
	private UserDao userDao;

	public List<Topic> findAllTopic() {
		// TODO Auto-generated method stub
		 List<Topic> list = topicDao.findAll();
         return list;
	}

	public void pageQuery(PageBean<Topic> pageBean) {
		// TODO Auto-generated method stub
		
	}

	public void addTopic(Topic model) {
		// TODO Auto-generated method stub
		topicDao.save(model);
	}

	public Topic findTopicById(Long id) {
		// TODO Auto-generated method stub
		return topicDao.findById(id);
	}

	public Page findTopics(String num) {
		int pageNum=1;
		if(num!=null){
			pageNum=Integer.parseInt(num);
		}
		int topicSize =(int)topicDao.findTopicSize();
			
		Page page=new Page(pageNum,topicSize);
		
		List<Topic> topics = topicDao.findTopics(page.getStartIndex(),page.getPageSize());
		
		page.setRecords(topics);
		return page;
		
	}
}
