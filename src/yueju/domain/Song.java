package yueju.domain;

import java.sql.Timestamp;

/**
 * Song entity. @author MyEclipse Persistence Tools
 */

public class Song implements java.io.Serializable {

	// Fields

	private Long songId;
	private String recorder;
	private Timestamp date;
	private String copyright;
	private String format;
	private Long size;
	private String keyword;
	private String description;
	private String singer;
	private String path;
	private String initiateName;
	private String uploadName;

	// Constructors

	/** default constructor */
	public Song() {
	}

	/** minimal constructor */
	public Song(String recorder, Timestamp date, String copyright,
			String format, Long size, String path, String initiateName,
			String uploadName) {
		this.recorder = recorder;
		this.date = date;
		this.copyright = copyright;
		this.format = format;
		this.size = size;
		this.path = path;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
	}

	/** full constructor */
	public Song(String recorder, Timestamp date, String copyright,
			String format, Long size, String keyword, String description,
			String singer, String path, String initiateName, String uploadName) {
		this.recorder = recorder;
		this.date = date;
		this.copyright = copyright;
		this.format = format;
		this.size = size;
		this.keyword = keyword;
		this.description = description;
		this.singer = singer;
		this.path = path;
		this.initiateName = initiateName;
		this.uploadName = uploadName;
	}

	// Property accessors

	public Long getSongId() {
		return this.songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}

	public String getRecorder() {
		return this.recorder;
	}

	public void setRecorder(String recorder) {
		this.recorder = recorder;
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

	public String getSinger() {
		return this.singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
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