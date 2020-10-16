package com.example.demoshop.ServiceIpml;

import com.example.demoshop.dao.CategoryDao;
import com.example.demoshop.domain.CategoryEntity;
import com.example.demoshop.dto.CategoryDto;
import com.example.demoshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;
    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryDao.getAllCategory();
    }

    @Override
    public CategoryEntity findByIdCategory(long id) {
        return categoryDao.findIdCategory(id);
    }

    @Override
    public CategoryEntity findNameCategory(String categoryName) {
        return categoryDao.findNameCategory(categoryName);
    }


    @Override
    public CategoryEntity save(CategoryDto category) {
        return null;
    }
}
