package com.bitlord.news.news.service;

import com.bitlord.news.news.entity.News;
import com.bitlord.news.news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    // Create new news
    public News createNewNews( News news ){

        News savedNews = newsRepository.save(news);
        return savedNews;

    }

    // Get All News
    public List< News > getAllNews(){
        List<News> allNews = newsRepository.findAll();
        return allNews;
    }

    // Get News By Id
    public  Optional<News> getNewsById ( Long id ){
        Optional<News> foundedNews = newsRepository.findById(id);
        return foundedNews;
    }

    // Update news
    public News updateNews ( Long id, News updatedNews ){

        News news = newsRepository.findById(id)
                .orElseThrow( ()-> new RuntimeException( "News not found with id " +id ) );

        // update fields
        news.setNews(updatedNews.getNews());
        news.setCategories( updatedNews.getCategories());

        // Save updated employee
        newsRepository.save( news );

        return news;
    }


    // Delete news
    public void deleteNews ( Long id ){
        newsRepository.deleteById( id );
    }

}
