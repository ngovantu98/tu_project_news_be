package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "`News`")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private int id;

	@Column(name = "`name`", length = 300)
	private String name;

	@Column(name = "`imageUrl`", length = 300)
	private String imageUrl;

	@Column(name = "`date`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;

	@OneToOne(mappedBy = "news",cascade = CascadeType.MERGE)
	
    private NewsDetail newsDetail;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "category_id")
	private Category category;

	public News() {

	}

	public News(int id, String name, String imageUrl, Date date, NewsDetail newsDetail, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.date = date;
		this.newsDetail = newsDetail;
		this.category = category;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public NewsDetail getNewsDetail() {
		return newsDetail;
	}

	public void setNewsDetail(NewsDetail newsDetail) {
		this.newsDetail = newsDetail;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}