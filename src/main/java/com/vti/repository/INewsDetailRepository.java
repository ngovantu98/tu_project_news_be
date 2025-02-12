package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.NewsDetail;

public interface INewsDetailRepository extends JpaRepository<NewsDetail, Integer> {
	//List<NewsDetail> findByType(String type);

}
