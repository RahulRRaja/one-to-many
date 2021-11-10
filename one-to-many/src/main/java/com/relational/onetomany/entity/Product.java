package com.relational.onetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Product {
    @Id
    private int pid;
    private String product_name;
    private int qty;
    private int price;



}
