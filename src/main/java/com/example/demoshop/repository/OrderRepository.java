package com.example.demoshop.repository;

import com.example.demoshop.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity , Long> {

}
