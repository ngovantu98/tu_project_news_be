package com.vti.dto;

import java.io.Serializable;
import java.util.List;
import com.vti.entity.News;


@SuppressWarnings("serial")
public class CategoryDTO implements Serializable {

	private String name;
	private int id;
	private List<News> news;

	public CategoryDTO(String name, int id, List<News> news) {

		this.name = name;
		this.id = id;
		this.news = news;
	}

	public CategoryDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

}
