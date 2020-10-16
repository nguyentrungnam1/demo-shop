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
@Table(name = "user")
public class UserEntity extends BaseEntiy {
    @Column
    private String username;

    @Column
    private String fullName;

    @Column
    private String phoneNumber;
    @Column
    private String address;


}
