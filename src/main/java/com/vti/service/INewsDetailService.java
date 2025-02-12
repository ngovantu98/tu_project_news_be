package com.vti.service;

import java.util.List;
import com.vti.entity.NewsDetail;
import com.vti.dto.NewsDetailFormCreate;

public interface INewsDetailService {


	public NewsDetail getNewsDetailByID(int id);

	public void createNewsDetail(NewsDetailFormCreate from);

	public void updateNewsDetail(NewsDetail newsSummary);

	public void deleteNewsDetail(int id);

	public boolean isNewsDetailExistsByID(int id);
	
	public List<NewsDetail> getNewsDetailByType(String type);

	public List<NewsDetail> getAllNewsDetails();

	
}
