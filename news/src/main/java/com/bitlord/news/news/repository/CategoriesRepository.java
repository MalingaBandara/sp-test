package com.bitlord.news.news.repository;

import com.bitlord.news.news.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository <Categories, Long>  {
}
