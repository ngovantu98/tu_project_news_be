package com.vti.dto;

import java.util.Date;
import com.vti.entity.News;
import com.vti.entity.NewsDetail;

public class NewsDetailFormCreate {

	private int id;
	private String name;
	private String title;
	private String content1;
	private String image1;
	private String content2;
	private String image2;
	private String content3;
	private String image3;
	private String content4;
	private Date date;
	private News news;

	public NewsDetailFormCreate() {

	}

	public NewsDetailFormCreate(int id, String name, String title, String content1, String image1, String content2,
			String image2, String content3, String image3, String content4, Date date, News news) {

		this.id = id;
		this.name = name;
		this.title = title;
		this.content1 = content1;
		this.image1 = image1;
		this.content2 = content2;
		this.image2 = image2;
		this.content3 = content3;
		this.image3 = image3;
		this.content4 = content4;
		this.date = date;
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

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getContent3() {
		return content3;
	}

	public void setContent3(String content3) {
		this.content3 = content3;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
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

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsDetail toEntity() {
		return new NewsDetail(id, name, title, content1, image1, content2, image2, content3, image3, content4, date,
				news);
	}

}
