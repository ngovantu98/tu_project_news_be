package com.vti.dto;

import java.sql.Date;
import com.vti.entity.Category;
import com.vti.entity.News;
import com.vti.entity.NewsDetail;

public class NewsFormCreate {

	private int id;
	private String name;
	private String imageUrl;
	private Date date;
	private NewsDetail newsDetail;
	private Category category;

	public NewsFormCreate() {

	}

	public NewsFormCreate(int id, String name, String imageUrl, Date date, NewsDetail newsDetail, Category category) {
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

	public News toEntity() {
		return new News(id, name, imageUrl, date, newsDetail, category);
	}

}
