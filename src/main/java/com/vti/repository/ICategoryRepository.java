package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.Category;


public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
