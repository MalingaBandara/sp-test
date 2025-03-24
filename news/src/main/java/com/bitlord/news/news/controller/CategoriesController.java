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

    @PostMapping
    public ResponseEntity<Categories> createCate(@RequestBody Categories cate ){
        Categories newcategory = categoriesService.createNewcategory(cate);
        return ResponseEntity.ok( newcategory );
    }

    @GetMapping
    public ResponseEntity<List<Categories>> getAllCate(){
        List<Categories> allCats = categoriesService.getAllCats();
        return ResponseEntity.ok( allCats );
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Categories> getCateById(@PathVariable Long id ){
        return categoriesService.getCatById(id).map( ResponseEntity::ok )
                .orElse( ResponseEntity.notFound().build());
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Categories> updateCate( @RequestBody Categories updatedCate, @PathVariable Long id ){
        Categories categories = categoriesService.updateCat(id, updatedCate);
        return ResponseEntity.ok( categories );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Void> deleteCate( @PathVariable Long id ){
        categoriesService.deleteCate( id );
        return ResponseEntity.noContent().build();
    }

}
