package com.store.springbootlombok.service;

import com.store.springbootlombok.model.Product;
import com.store.springbootlombok.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return  productRepository.save(product);
    }

//    @Override
//    public Product getProductById(Long id) {
//        return productRepository.findById(id).orElse(null);
    }

