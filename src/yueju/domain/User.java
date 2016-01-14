package yueju.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Long id;
	private String password;
	private String name;
	private String trueName;
	private String gender;
	private Timestamp birthday;
	private String place;
	private String tel;
	private String email;
	private String wechat;
	private String qq;
	private Set sihuojujoins = new HashSet(0);
	private Set topics = new HashSet(0);
	private Set sihuojuinfos = new HashSet(0);
	private Set replies = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String password, String name, String trueName, String gender,
			Timestamp birthday, String place, String tel, String email,
			String wechat, String qq, Set sihuojujoins, Set topics,
			Set sihuojuinfos, Set replies) {
		this.password = password;
		this.name = name;
		this.trueName = trueName;
		this.gender = gender;
		this.birthday = birthday;
		this.place = place;
		this.tel = tel;
		this.email = email;
		this.wechat = wechat;
		this.qq = qq;
		this.sihuojujoins = sihuojujoins;
		this.topics = topics;
		this.sihuojuinfos = sihuojuinfos;
		this.replies = replies;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Set getSihuojujoins() {
		return this.sihuojujoins;
	}

	public void setSihuojujoins(Set sihuojujoins) {
		this.sihuojujoins = sihuojujoins;
	}

	public Set getTopics() {
		return this.topics;
	}

	public void setTopics(Set topics) {
		this.topics = topics;
	}

	public Set getSihuojuinfos() {
		return this.sihuojuinfos;
	}

	public void setSihuojuinfos(Set sihuojuinfos) {
		this.sihuojuinfos = sihuojuinfos;
	}

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

}