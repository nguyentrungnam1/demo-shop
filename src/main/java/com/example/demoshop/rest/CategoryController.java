package com.example.demoshop.rest;

import com.example.demoshop.ServiceIpml.CategoryServiceImpl;
import com.example.demoshop.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path = "/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;
    @GetMapping("/Get_category")
    public ResponseEntity<?> getAllCategory(){
        return ResponseEntity.ok(categoryServiceImpl.getAllCategory());
    }

    @GetMapping("/get_category_name")
    public ResponseEntity<?> getNameCategory(@RequestParam("categoryName") String categoryName){
        return ResponseEntity.ok(categoryServiceImpl.findNameCategory(categoryName));
    }

    @GetMapping("get_id")
    public ResponseEntity<?> getByIdCategory(@RequestParam("id") long id){
        return ResponseEntity.ok(categoryServiceImpl.findByIdCategory(id));
    }


}
