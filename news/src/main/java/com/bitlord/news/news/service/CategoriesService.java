package com.bitlord.news.news.service;



import com.bitlord.news.news.entity.Categories;
import com.bitlord.news.news.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;


    // Create new category
    public Categories createNewcategory(Categories categories ){

        Categories savedCat = categoriesRepository.save(categories);
        return savedCat;

    }

    // Get All Cate
    public List< Categories > getAllCats(){
        List<Categories> allCats = categoriesRepository.findAll();
        return allCats;
    }

    // Get Cate By Id
    public Optional<Categories> getCatById (Long id ){
        Optional<Categories> foundedCat = categoriesRepository.findById(id);
        return foundedCat;
    }

    // Update Cate
    public Categories updateCat ( Long id, Categories updatedCat){

        Categories cate = categoriesRepository.findById(id)
                .orElseThrow( ()-> new RuntimeException( "Category not found with id " +id ) );

        // update fields
        cate.setCategoryName(updatedCat.getCategoryName() );
        cate.setNews( updatedCat.getNews() );

        // Save updated employee
        categoriesRepository.save( cate );

        return cate;
    }


    // Delete Cate
    public void deleteCate ( Long id ){
        categoriesRepository.deleteById( id );
    }

}
