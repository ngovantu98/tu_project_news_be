package com.vti.dto;

import java.util.List;
import com.vti.entity.Category;
import com.vti.entity.News;

public class CategoryFormCreate {

	private int id;
	private String name;
	private List<News> news;

	public CategoryFormCreate() {

	}

	public CategoryFormCreate(int id, String name, List<News> news) {
		super();
		this.id = id;
		this.name = name;
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

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public Category toEntity() {
		return new Category(id, name, news);
	}

}
