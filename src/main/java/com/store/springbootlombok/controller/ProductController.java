package com.store.springbootlombok.controller;

import com.store.springbootlombok.model.Product;
import com.store.springbootlombok.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/get/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/save/products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
