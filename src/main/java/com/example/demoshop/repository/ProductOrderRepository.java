package com.example.demoshop.repository;

import com.example.demoshop.domain.ProductOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrderEntity , Long> {
    List<ProductOrderEntity>findByOrderId(Long orderId);
}
