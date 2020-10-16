package com.example.demoshop.repository;

import com.example.demoshop.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity , Long>{
    @Query("SELECT e FROM ProductEntity e where e.productName = :productName AND e.unitPrice = :unitPrice")
    List<ProductEntity>findByProductNameAndUnitPrice(@Param("productName") String productName , @Param("unitPrice") double unitPrice);
}
