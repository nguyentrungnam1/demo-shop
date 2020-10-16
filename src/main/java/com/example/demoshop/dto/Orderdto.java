package com.example.demoshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class Orderdto {
    private Long id;
    private Long userId;

    public static <T> T transferObject(Object model, Class<T> type){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(model, type);
    }
}
