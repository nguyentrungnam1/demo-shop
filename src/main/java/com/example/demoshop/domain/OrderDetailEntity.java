package com.example.demoshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_detail")
public class OrderDetailEntity extends BaseEntiy {

    @Column
    private Long userOrderId;

    @Column
    private Long productId;

    @Column
    private int qty;
}
