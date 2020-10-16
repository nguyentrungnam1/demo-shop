package com.example.demoshop.dto;

import com.example.demoshop.domain.ProductEntity;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String productName;
    private double unitPrice;


    public static ProductDto tranferObject(ProductEntity products) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(products, ProductDto.class);
    }

    public static ProductEntity tranferEntity(ProductDto productsDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(productsDTO, ProductEntity.class);
    }

}
