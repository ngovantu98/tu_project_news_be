package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "`NewsDetail`")
public class NewsDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private int id;

	@Column(name = "`name`", length = 300)
	private String name;

	@Column(name = "`title`", length = 400)
	private String title;

	@Column(name = "`content1`", length = 2000)
	private String content1;

	@Column(name = "`content2`", length = 2000)
	private String content2;

	@Column(name = "`content3`", length = 2000)
	private String content3;

	@Column(name = "`content4`", length = 2000)
	private String content4;

	@Column(name = "`date`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;

	@OneToMany(mappedBy = "newsDetail")
	@Fetch(FetchMode.SUBSELECT)
	private List<Image> image;
	
	@JsonIgnore
	@OneToOne(mappedBy = "newsDetail")
	
	private News news;


	public NewsDetail() {
		super();
	}

	public NewsDetail(int id, String name, String title, String content1, String content2, String content3,
			String content4, Date date, List<Image> image, News news) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content1 = content1;
		this.content2 = content2;
		this.content3 = content3;
		this.content4 = content4;
		this.date = date;
		this.image = image;
		this.news = news;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public String getContent3() {
		return content3;
	}

	public void setContent3(String content3) {
		this.content3 = content3;
	}

	public String getContent4() {
		return content4;
	}

	public void setContent4(String content4) {
		this.content4 = content4;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

//	@OneToOne(cascade = CascadeType.MERGE)
//	@JoinColumn(name = "news_id")
//	private News news;

}