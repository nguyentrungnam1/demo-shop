package com.example.demoshop.rest;

import com.example.demoshop.ServiceIpml.ProductOrderServiceImlp;
import com.example.demoshop.domain.ProductOrderEntity;

import com.example.demoshop.service.ProductOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping (path = "/product_order")
public class ProductOrderController {
    @Autowired
    ProductOrderServiceImlp productOrderServiceImlp;
    @Autowired
    ProductOrderService productOrderService;

    @PostMapping("/update_productorder")
    public ProductOrderEntity updateProductOrder(@RequestBody ProductOrderEntity productOrderEntity){
        return null;

    }

}
