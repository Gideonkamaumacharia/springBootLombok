package com.store.springbootlombok.service;

import com.store.springbootlombok.model.Product;


import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(Long productId);
    Product updateProduct (Long id,Product product);
    void deleteProduct(Long id);
}
