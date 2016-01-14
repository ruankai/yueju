package yueju.domain;

/**
 * Filelog entity. @author MyEclipse Persistence Tools
 */

public class Filelog implements java.io.Serializable {

	// Fields

	private Long id;
	private String path;

	// Constructors

	/** default constructor */
	public Filelog() {
	}

	/** full constructor */
	public Filelog(String path) {
		this.path = path;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}