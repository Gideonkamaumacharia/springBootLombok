package com.store.springbootlombok.controller;

import com.store.springbootlombok.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product(1, "Microwave", 999.99, 10),
                new Product(2, "Phone", 499.50, 15),
                new Product(3, "Mouse", 199.99, 10)
        );
    }
}
