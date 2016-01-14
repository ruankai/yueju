package yueju.dao.impl;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import yueju.dao.TopicDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Topic;

@Entity
@Repository
public class TopicDaoImpl extends BaseDaoImpl<Topic> implements TopicDao {
	public int findTopicSize() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Topic";
		List list = this.getHibernateTemplate().find(hql);
		Number num = (Number) list.get(0);   
		return num.intValue();   
	}

	public List<Topic> findTopics(int startIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession(); 
		Query q = session.createQuery("from Topic");
		q.setFirstResult(startIndex); 
		q.setMaxResults(pageSize); 
		return q.list();
	}

}
