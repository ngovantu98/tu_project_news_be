package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.NewsDetail;
import com.vti.dto.NewsDetailFormCreate;
import com.vti.repository.INewsDetailRepository;

@Service
public class NewsDetailService implements INewsDetailService {

	@Autowired
	private INewsDetailRepository repository;

	public List<NewsDetail> getAllNewsDetails() {
		return repository.findAll();
	}

	public NewsDetail getNewsDetailByID(int id) {
		return repository.findById(id).get();
	}

	public void createNewsDetail(NewsDetailFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateNewsDetail(NewsDetail newsSummary) {
		repository.save(newsSummary);
	}

	public void deleteNewsDetail(int id) {
		repository.deleteById(id);
	}

	public boolean isNewsDetailExistsByID(int id) {
		return repository.existsById(id);
	}

	@Override
	public List<NewsDetail> getNewsDetailByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}



//	public List<NewsDetail> getNewsSummaryByType(String type) {
//		return repository.findByType(type);
//	}

}
