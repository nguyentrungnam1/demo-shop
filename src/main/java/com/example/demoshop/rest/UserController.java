package com.example.demoshop.rest;

import com.example.demoshop.ServiceIpml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/get_user")
    public ResponseEntity<?> getAllByUser (){
        return ResponseEntity.ok(userService.getByAllUser());
    }
}
