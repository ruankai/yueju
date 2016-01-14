package yueju.dao;

import java.util.List;

import yueju.dao.base.BaseDao;
import yueju.domain.Topic;

public interface TopicDao extends BaseDao<Topic> {

	int findTopicSize();

	List<Topic> findTopics(int startIndex, int pageSize);

}
