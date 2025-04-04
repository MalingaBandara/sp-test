package com.bitlord.news.news.service;



import com.bitlord.news.news.entity.Categories;
import com.bitlord.news.news.entity.News;
import com.bitlord.news.news.repository.CategoriesRepository;
import com.bitlord.news.news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private NewsRepository newsRepository;

    public Categories addCateToNews ( Long newsId, Categories categories ){

        News news = newsRepository.findById(newsId).orElseThrow(() -> new RuntimeException("Cannot find news with id " + newsId));

        categories.setNews( news );

        return categoriesRepository.save( categories );
    }

    public List<Categories> getCatesByNewsId(Long newsId) {

        News news = newsRepository.findById(newsId).orElseThrow(() -> new RuntimeException("Cannot find news with id " + newsId));

        return news.getCategories();
    }

}
