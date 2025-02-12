package com.vti.dto;

import java.io.Serializable;
import com.vti.entity.NewsDetail;

@SuppressWarnings("serial")
public class ImageDTO implements Serializable {

	private int id;
	private String name;
	private String url;
	private NewsDetail newsDetail;

	public ImageDTO() {
		super();
	}

	public ImageDTO(int id, String name, String url, NewsDetail newsDetail) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.newsDetail = newsDetail;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public NewsDetail getNewsDetail() {
		return newsDetail;
	}

	public void setNewsDetail(NewsDetail newsDetail) {
		this.newsDetail = newsDetail;
	}

}
