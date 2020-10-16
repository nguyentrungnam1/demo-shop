package com.example.demoshop.dao;

import com.example.demoshop.domain.ProductEntity;
import com.example.demoshop.dto.ProductDto;
import com.example.demoshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDao {
    @Autowired
    ProductRepository productRepository;
    public List<ProductEntity> findByAllEntity(){
        List<ProductEntity> pros =productRepository.findAll();
        return pros;
    }
    public Optional<ProductEntity> findId(long id){
        Optional<ProductEntity> pros = productRepository.findById(id);
        return pros;
    }
    public ProductEntity save(ProductDto product){
        ProductEntity pros = ProductDto.tranferEntity(product);
        return productRepository.saveAndFlush(pros);
    }
    public void delete(long id){
        productRepository.deleteById(id);
    }
    public List<ProductEntity> findByNameAndPrice(String productName , double unitPrice){
        return productRepository.findByProductNameAndUnitPrice(productName,unitPrice);
    }
}
