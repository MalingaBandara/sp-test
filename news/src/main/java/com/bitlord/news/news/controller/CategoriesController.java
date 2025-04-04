package com.bitlord.news.news.controller;

import com.bitlord.news.news.entity.Categories;
import com.bitlord.news.news.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/cate" )
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    // Add categories to news
    @PostMapping( "/news/{newsId}" )
    public ResponseEntity<String> addCateToNews( @PathVariable Long newsId, @RequestBody Categories categories ){

        Categories newCate = categoriesService.addCateToNews(newsId, categories);

        return ResponseEntity.ok( "Your new Category type successfully added to news: ");

    }

    // Get categories by news id
    @GetMapping( "/news/{newsId}" )
    public ResponseEntity< List<Categories> > getCatesByNewsId( @PathVariable Long newsId ) {
        List<Categories> catesByNewsId = categoriesService.getCatesByNewsId(newsId);

        return ResponseEntity.ok( catesByNewsId );
    }

}
