package yueju.domain;

/**
 * Minreninfo entity. @author MyEclipse Persistence Tools
 */

public class Minreninfo implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String content;
	private Integer count;

	// Constructors

	/** default constructor */
	public Minreninfo() {
	}

	/** full constructor */
	public Minreninfo(String name, String content, Integer count) {
		this.name = name;
		this.content = content;
		this.count = count;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}