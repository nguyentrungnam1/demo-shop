package com.example.demoshop.repository;

import com.example.demoshop.domain.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Long> {
}
