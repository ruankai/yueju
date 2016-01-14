package yueju.domain;

/**
 * Sihuojujoin entity. @author MyEclipse Persistence Tools
 */

public class Sihuojujoin implements java.io.Serializable {

	// Fields

	private Long id;
	private Sihuojuinfo sihuojuinfo;
	private User user;
	private Integer type;

	// Constructors

	/** default constructor */
	public Sihuojujoin() {
	}

	/** full constructor */
	public Sihuojujoin(Sihuojuinfo sihuojuinfo, User user, Integer type) {
		this.sihuojuinfo = sihuojuinfo;
		this.user = user;
		this.type = type;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Sihuojuinfo getSihuojuinfo() {
		return this.sihuojuinfo;
	}

	public void setSihuojuinfo(Sihuojuinfo sihuojuinfo) {
		this.sihuojuinfo = sihuojuinfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}