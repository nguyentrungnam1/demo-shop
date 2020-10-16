package com.example.demoshop.ServiceIpml;

import com.example.demoshop.dao.UserDao;
import com.example.demoshop.domain.UserEntity;
import com.example.demoshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getByAllUser() {
        return userDao.findByAllUserEntity();
    }
}
