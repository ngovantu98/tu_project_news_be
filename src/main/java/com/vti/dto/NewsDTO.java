package com.vti.dto;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vti.entity.Category;
import com.vti.entity.NewsDetail;

@SuppressWarnings("serial")
public class NewsDTO implements Serializable {

	private int id;
	private String name;
	private String imageUrl;
	private Date date;
 


	public NewsDTO(int id, String name, String imageUrl, Date date) {
	
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.date = date;
		
	
	}

	public NewsDTO() {
	
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

	

	

}
