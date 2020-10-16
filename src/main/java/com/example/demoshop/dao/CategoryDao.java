package com.example.demoshop.dao;

import com.example.demoshop.domain.CategoryEntity;
import com.example.demoshop.dto.CategoryDto;
import com.example.demoshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDao {
    @Autowired
    CategoryRepository categoryRepository;

    public List<CategoryEntity> getAllCategory(){
        List<CategoryEntity> cate = categoryRepository.findAll();
        return cate;
    }

    public  CategoryEntity findNameCategory(String categoryName){
        return categoryRepository.findByCategoryName(categoryName);
    }
    public  CategoryEntity findIdCategory(long id){
        return categoryRepository.findByIdCategory(id);
    }

}
