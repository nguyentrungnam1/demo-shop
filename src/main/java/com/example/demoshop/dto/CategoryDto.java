package com.example.demoshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class CategoryDto {
    private Long id;
    private String categoryName;
    private String productName;

    public static <T> T transferObject(Object model, Class<T> type){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(model, type);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
