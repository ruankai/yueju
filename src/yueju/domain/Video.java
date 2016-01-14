package yueju.domain;

import java.sql.Timestamp;

/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video implements java.io.Serializable {

	// Fields

	private Long videoId;
	private String photographer;
	private Timestamp date;
	private String copyright;
	private String format;
	private Long size;
	private String keyword;
	private String description;
	private String video;
	private String initiateName;
	private String uploadName;
	private String preview;

	// Constructors

	/** default constructor */
	public Video() {
	}

	/** minimal constructor */
	public Video(String photographer, Timestamp date, String copyright,
			String format, Long size, String video, String initiateName,
			String uploadName) {
		this.photographer = photographer;
		this.date = date;
		this.copyright = copyright;
		this.format = format;
		this.size = size;
		this.video = video;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
	}

	/** full constructor */
	public Video(String photographer, Timestamp date, String copyright,
			String format, Long size, String keyword, String description,
			String video, String initiateName, String uploadName, String preview) {
		this.photographer = photographer;
		this.date = date;
		this.copyright = copyright;
		this.format = format;
		this.size = size;
		this.keyword = keyword;
		this.description = description;
		this.video = video;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
		this.preview = preview;
	}

	// Property accessors

	public Long getVideoId() {
		return this.videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
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

	public String getCopyright() {
		return this.copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
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

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
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

	public String getPreview() {
		return this.preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

}