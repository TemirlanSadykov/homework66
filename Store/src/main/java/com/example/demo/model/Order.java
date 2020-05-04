package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter buyer name")
    @Column(length = 128)
    private String buyerName;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String storeName;

    @NotBlank(message = "You don't enter product name")
    @Column(length = 128)
    private String productName;

}
