package com.example.demoshop.service;

import com.example.demoshop.domain.ProductEntity;
import com.example.demoshop.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<ProductEntity>getAllEntities();
    public ProductEntity getById(long id);
    public Optional<ProductEntity> findById(long id);
    public void delete(long id);
    public ProductEntity save (ProductDto product);
    public List<ProductEntity> findByNameAndPrice(String productName , double unitPrice);


}
