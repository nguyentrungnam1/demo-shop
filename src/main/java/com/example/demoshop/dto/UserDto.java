package com.example.demoshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private String phoneNumber;
    private String address;


    public static <T> T transferObject(Object model, Class<T> type){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(model, type);
    }
}
