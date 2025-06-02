package com.store.springbootlombok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor   //provides the no args constructor to be used by jackson to create the Object
@AllArgsConstructor  //Provides the constructor with arguments for all fields
@Data            //Generates getters,setters,toString etc
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private double price;
    private int quantity;
}
