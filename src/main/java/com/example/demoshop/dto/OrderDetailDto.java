package com.example.demoshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class OrderDetailDto {
    private Long id;
    private Long userOrderId;
    private Long productId;
    private int qty;

    public static <T> T transferObject(Object model, Class<T> type){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(model, type);
    }
}
