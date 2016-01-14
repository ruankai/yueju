package yueju.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private Long id;
	private Topic topic;
	private User user;
	private String title;
	private String content;
	private Timestamp postTime;
	private String ipAddr;
	private Set topics = new HashSet(0);

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** full constructor */
	public Reply(Topic topic, User user, String title, String content,
			Timestamp postTime, String ipAddr, Set topics) {
		this.topic = topic;
		this.user = user;
		this.title = title;
		this.content = content;
		this.postTime = postTime;
		this.ipAddr = ipAddr;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Timestamp postTime) {
		this.postTime = postTime;
	}

	public String getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Set getTopics() {
		return this.topics;
	}

	public void setTopics(Set topics) {
		this.topics = topics;
	}

}