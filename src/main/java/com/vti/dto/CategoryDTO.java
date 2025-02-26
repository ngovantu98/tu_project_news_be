package com.vti.dto;

import java.io.Serializable;
import java.util.List;
import com.vti.entity.News;


@SuppressWarnings("serial")
public class CategoryDTO implements Serializable {

	private String name;
	private int id;
	

	public CategoryDTO(String name, int id ) {

		this.name = name;
		this.id = id;
		
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

	

}
