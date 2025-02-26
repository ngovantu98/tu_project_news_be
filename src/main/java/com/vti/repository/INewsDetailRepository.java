package com.vti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vti.entity.NewsDetail;

public interface INewsDetailRepository extends JpaRepository<NewsDetail, Integer> {

	//List<NewsDetail> findByType(String type);

}
