package yueju.service;

import java.util.List;

import yueju.common.Page;
import yueju.domain.Topic;
import yueju.service.page.PagableService;

public interface TopicService extends PagableService<Topic> {

  public	List<Topic> findAllTopic();

public void addTopic(Topic model);

public Topic findTopicById(Long id);

public Page findTopics(String num);

}
