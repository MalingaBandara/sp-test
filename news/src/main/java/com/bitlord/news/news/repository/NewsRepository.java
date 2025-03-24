package com.bitlord.news.news.repository;

import com.bitlord.news.news.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News , Long> {

}
