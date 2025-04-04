package com.bitlord.news.news.controller;

import com.bitlord.news.news.entity.News;
import com.bitlord.news.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// localhost:8080/api/news

@RestController
@RequestMapping( "/api/news")
public class NewsConroller {

        @Autowired
        private NewsService newsService;

        @PostMapping
        public ResponseEntity<News> createNews (@RequestBody News news ){

                News newNews = newsService.createNewNews(news);
                return ResponseEntity.ok(  newNews );
        }

        @GetMapping
        public ResponseEntity<List<News>> getAllNews ( ){
                List<News> allNews = newsService.getAllNews();
                return ResponseEntity.ok( allNews );
        }

        @GetMapping( "/{id}" )
        public ResponseEntity<News> getNewsById( @PathVariable Long id ){
                return newsService.getNewsById(id).map( ResponseEntity::ok )
                        .orElse( ResponseEntity.notFound().build());
        }

        @PutMapping( "/{id}" )
        public ResponseEntity<News> updateNews( @RequestBody News updatedNews, @PathVariable Long id) {
                News news = newsService.updateNews(id, updatedNews);
                return ResponseEntity.ok( news );
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteNews( @PathVariable Long id){
                newsService.deleteNews( id );
                return ResponseEntity.noContent().build();
        }
}
