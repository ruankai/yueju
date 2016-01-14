package yueju.service.impl;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import yueju.dao.NewsDao;
import yueju.dao.ReplyDao;
import yueju.dao.TopicDao;
import yueju.domain.Reply;
import yueju.domain.Topic;
import yueju.page.PageBean;
import yueju.service.ReplyService;

@Entity
@Service
@Transactional
public class ReplyServiceImpl implements ReplyService {

	@ManyToOne
	@Autowired
	private ReplyDao replyDao;
	
	@ManyToOne
	@Autowired
	private TopicDao topicDao;
	public void addReply(Reply reply) {
		// TODO Auto-generated method stub
		Topic topic = topicDao.findById(reply.getTopic().getId()); //执行select语句，topic 持久态
		topic.setLastUpdateTime(reply.getPostTime());	//修改一级缓存,提交时快照对比，自动update
		//保存回复
		replyDao.save(reply);
	}
	public void pageQuery(PageBean<Reply> pageBean) {
		// TODO Auto-generated method stub
		
	}

}
