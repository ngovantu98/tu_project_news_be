package com.vti.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.vti.entity.Image;
import com.vti.entity.News;

@SuppressWarnings("serial")
public class NewsDetailDTO implements Serializable {

	private int id;
	private String name;
	private String title;
	private String content1;
	private String content2;
	private String content3;
	private String content4;
	private Date date;
	private List<Image> image;
	private News news;

	public NewsDetailDTO(int id, String name, String title, String content1, String content2, String content3,
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

	public NewsDetailDTO() {
		super();
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

}
