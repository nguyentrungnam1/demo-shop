package com.example.demoshop.dao;

import com.example.demoshop.domain.UserEntity;
import com.example.demoshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Component
public class UserDao {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> findByAllUserEntity(){
        List<UserEntity> user = userRepository.findAll();
        return user;
    }
}
