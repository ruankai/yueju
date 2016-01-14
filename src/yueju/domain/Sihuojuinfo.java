package yueju.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Sihuojuinfo entity. @author MyEclipse Persistence Tools
 */

public class Sihuojuinfo implements java.io.Serializable {

	// Fields

	private Long id;
	private User user;
	private String name;
	private String place;
	private String description;
	private Timestamp firstTime;
	private Integer type;
	private Integer count;
	private Set sihuojujoins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sihuojuinfo() {
	}

	/** full constructor */
	public Sihuojuinfo(User user, String name, String place,
			String description, Timestamp firstTime, Integer type,
			Integer count, Set sihuojujoins) {
		this.user = user;
		this.name = name;
		this.place = place;
		this.description = description;
		this.firstTime = firstTime;
		this.type = type;
		this.count = count;
		this.sihuojujoins = sihuojujoins;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Set getSihuojujoins() {
		return this.sihuojujoins;
	}

	public void setSihuojujoins(Set sihuojujoins) {
		this.sihuojujoins = sihuojujoins;
	}

}