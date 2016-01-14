package yueju.domain;

import java.util.Date;

/**
 * Infopush entity. @author MyEclipse Persistence Tools
 */

public class Infopush implements java.io.Serializable {

	// Fields

	private long id;
	private String newstitle;
	private String url;
	private String photopath;
	private String phototitle;
	private Date time;

	// Constructors

	/** default constructor */
	public Infopush() {
	}

	/** full constructor */
	public Infopush(String newstitle, String url, String photopath,
			String phototitle, Date time) {
		this.newstitle = newstitle;
		this.url = url;
		this.photopath = photopath;
		this.phototitle = phototitle;
		this.time = time;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNewstitle() {
		return this.newstitle;
	}

	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhotopath() {
		return this.photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public String getPhototitle() {
		return this.phototitle;
	}

	public void setPhototitle(String phototitle) {
		this.phototitle = phototitle;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}