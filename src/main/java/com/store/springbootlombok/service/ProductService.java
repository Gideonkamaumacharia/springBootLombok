package com.store.springbootlombok.service;

import com.store.springbootlombok.model.Product;


import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
}
