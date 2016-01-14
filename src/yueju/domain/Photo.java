package yueju.domain;

import java.sql.Timestamp;

/**
 * Photo entity. @author MyEclipse Persistence Tools
 */

public class Photo implements java.io.Serializable {

	// Fields

	private Long photoId;
	private String roleName;
	private String photographer;
	private Timestamp date;
	private Long size;
	private String type;
	private String copyright;
	private String keyword;
	private String description;
	private String photo;
	private String initiateName;
	private String uploadName;

	// Constructors

	/** default constructor */
	public Photo() {
	}

	/** minimal constructor */
	public Photo(String photographer, Timestamp date, Long size, String type,
			String copyright, String photo, String initiateName,
			String uploadName) {
		this.photographer = photographer;
		this.date = date;
		this.size = size;
		this.type = type;
		this.copyright = copyright;
		this.photo = photo;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
	}

	/** full constructor */
	public Photo(String roleName, String photographer, Timestamp date,
			Long size, String type, String copyright, String keyword,
			String description, String photo, String initiateName,
			String uploadName) {
		this.roleName = roleName;
		this.photographer = photographer;
		this.date = date;
		this.size = size;
		this.type = type;
		this.copyright = copyright;
		this.keyword = keyword;
		this.description = description;
		this.photo = photo;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
	}

	// Property accessors

	public Long getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getPhotographer() {
		return this.photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCopyright() {
		return this.copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getInitiateName() {
		return this.initiateName;
	}

	public void setInitiateName(String initiateName) {
		this.initiateName = initiateName;
	}

	public String getUploadName() {
		return this.uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

}