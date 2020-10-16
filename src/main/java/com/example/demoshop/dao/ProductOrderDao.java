package com.example.demoshop.dao;

import com.example.demoshop.domain.ProductOrderEntity;
import com.example.demoshop.repository.ProductOrderRepository;
import com.example.demoshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductOrderDao {
    @Autowired
    ProductOrderRepository productOrderRepository;
    @Autowired
    ProductRepository productRepository;

    public ProductOrderEntity save(long productId, long oderId, String productName, long quantity, long price) {
        ProductOrderEntity pro = new ProductOrderEntity();
        pro.setOrderId(oderId);
        pro.setProductId(productId);
        pro.setProductName(productName);
        pro.setQuantity(price);
        return productOrderRepository.saveAndFlush(pro);
    }
}
