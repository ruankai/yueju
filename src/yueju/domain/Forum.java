package yueju.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Forum entity. @author MyEclipse Persistence Tools
 */

public class Forum implements java.io.Serializable {

	// Fields

	private Long id;
	private Topic topic;
	private String name;
	private String description;
	private Integer position;
	private Integer topicCount;
	private Integer articleCount;
	private Set topics = new HashSet(0);

	// Constructors

	/** default constructor */
	public Forum() {
	}

	/** full constructor */
	public Forum(Topic topic, String name, String description,
			Integer position, Integer topicCount, Integer articleCount,
			Set topics) {
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.position = position;
		this.topicCount = topicCount;
		this.articleCount = articleCount;
		this.topics = topics;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getTopicCount() {
		return this.topicCount;
	}

	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	public Integer getArticleCount() {
		return this.articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}

	public Set getTopics() {
		return this.topics;
	}

	public void setTopics(Set topics) {
		this.topics = topics;
	}

}