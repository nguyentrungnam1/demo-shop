package com.example.demoshop.ServiceIpml;

import com.example.demoshop.dao.ProductDao;
import com.example.demoshop.domain.ProductEntity;
import com.example.demoshop.dto.ProductDto;
import com.example.demoshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public List<ProductEntity> getAllEntities() {
        return productDao.findByAllEntity();
    }

    @Override
    public ProductEntity getById(long id) {
        return null;

    }

    @Override
    public Optional<ProductEntity> findById(long id) {

        return productDao.findId(id);
    }

    @Override
    public void delete(long id) {
        productDao.delete(id);
    }


    @Override
    public ProductEntity save(ProductDto product) {
        return productDao.save(product);
    }

    @Override
    public List<ProductEntity> findByNameAndPrice(String productName, double unitPrice) {
        return productDao.findByNameAndPrice(productName , unitPrice);
    }
}
