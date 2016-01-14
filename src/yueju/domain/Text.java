package yueju.domain;

/**
 * Text entity. @author MyEclipse Persistence Tools
 */

public class Text implements java.io.Serializable {

	// Fields

	private Long textId;
	private String title;
	private String author;
	private String themes;
	private String content;
	private String url;
	private String issn;

	// Constructors

	/** default constructor */
	public Text() {
	}

	/** minimal constructor */
	public Text(String title, String author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}

	/** full constructor */
	public Text(String title, String author, String themes, String content,
			String url, String issn) {
		this.title = title;
		this.author = author;
		this.themes = themes;
		this.content = content;
		this.url = url;
		this.issn = issn;
	}

	// Property accessors

	public Long getTextId() {
		return this.textId;
	}

	public void setTextId(Long textId) {
		this.textId = textId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getThemes() {
		return this.themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

}