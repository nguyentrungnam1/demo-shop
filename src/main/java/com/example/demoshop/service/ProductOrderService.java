package com.example.demoshop.service;


import com.example.demoshop.domain.ProductOrderEntity;

public interface ProductOrderService {

    public ProductOrderEntity save(long productId, long oderId, String productName, long quantity, long price);

}
