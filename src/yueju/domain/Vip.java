package yueju.domain;

import java.sql.Timestamp;

/**
 * Vip entity. @author MyEclipse Persistence Tools
 */

public class Vip implements java.io.Serializable {

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
	private String organizationId;
	private String companyTel;
	private String companyPlace;
	private String duty;
	private String rank;
	private String school;
	private String tenureClock;
	private String education;
	private String degree;
	private String pose;
	private String remark;
	private String type;

	// Constructors

	/** default constructor */
	public Vip() {
	}

	/** full constructor */
	public Vip(String password, String name, String trueName, String gender,
			Timestamp birthday, String place, String tel, String email,
			String wechat, String qq, String organizationId, String companyTel,
			String companyPlace, String duty, String rank, String school,
			String tenureClock, String education, String degree, String pose,
			String remark, String type) {
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
		this.organizationId = organizationId;
		this.companyTel = companyTel;
		this.companyPlace = companyPlace;
		this.duty = duty;
		this.rank = rank;
		this.school = school;
		this.tenureClock = tenureClock;
		this.education = education;
		this.degree = degree;
		this.pose = pose;
		this.remark = remark;
		this.type = type;
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

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getCompanyTel() {
		return this.companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanyPlace() {
		return this.companyPlace;
	}

	public void setCompanyPlace(String companyPlace) {
		this.companyPlace = companyPlace;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getTenureClock() {
		return this.tenureClock;
	}

	public void setTenureClock(String tenureClock) {
		this.tenureClock = tenureClock;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getPose() {
		return this.pose;
	}

	public void setPose(String pose) {
		this.pose = pose;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}