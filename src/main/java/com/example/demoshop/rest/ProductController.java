package com.example.demoshop.rest;

import com.example.demoshop.ServiceIpml.ProductServiceImpl;
import com.example.demoshop.domain.ProductEntity;
import com.example.demoshop.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceIml;


    @GetMapping("/Get_product")
    public ResponseEntity<?> getAllEntity(){
        return ResponseEntity.ok(productServiceIml.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>findProductId(@PathVariable("id")long id){
        return ResponseEntity.ok(productServiceIml.findById(id));

    }
    @PostMapping("/add_product")
    public ResponseEntity<?>saveProduct(@RequestBody ProductDto productDto){
        productServiceIml.save(productDto);
        return ResponseEntity.ok(productDto);
    }

    @PostMapping("/delete_product/{id}")
    public void delete(@PathVariable("id")long id){
        productServiceIml.delete(id);
    }

    @GetMapping("/get_name_and_price")
    public ResponseEntity<?>getNameAndPrice(@RequestParam(" productName") String productName , @RequestParam("unitPrice") double unitPrice){
        return ResponseEntity.ok(productServiceIml.findByNameAndPrice(productName,unitPrice));
    }



}
