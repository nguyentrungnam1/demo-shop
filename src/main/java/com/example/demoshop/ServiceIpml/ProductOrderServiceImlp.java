package com.example.demoshop.ServiceIpml;

import com.example.demoshop.dao.ProductOrderDao;
import com.example.demoshop.domain.ProductOrderEntity;
import com.example.demoshop.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductOrderServiceImlp implements ProductOrderService {
    @Autowired
    ProductOrderDao productOrderDao;
    @Override
    public ProductOrderEntity save(long productId, long oderId, String productName, long quantity, long price) {
        return productOrderDao.save(productId,oderId,productName,quantity,price);
    }
}
