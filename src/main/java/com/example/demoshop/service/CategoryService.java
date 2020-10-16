package com.example.demoshop.service;

import com.example.demoshop.domain.CategoryEntity;
import com.example.demoshop.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getAllCategory();
    public CategoryEntity findByIdCategory(long id);
    public CategoryEntity findNameCategory(String categoryName);
    public CategoryEntity save(CategoryDto category);

}
