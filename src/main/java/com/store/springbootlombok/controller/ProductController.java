package com.store.springbootlombok.controller;

import com.store.springbootlombok.model.Product;
import com.store.springbootlombok.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    //This is constructor injection an element of Dependency Injection
    //RequiredArgsConstructor is used to create a constructor for fields that are final or NotNull
    private final ProductService productService;

    @GetMapping("/get/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/save/products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/get/product/byId")
    public Product getProductById(@RequestParam("productId") Long id) {return productService.getProductById(id);}

    @PutMapping("/update/product/{id}")
    public Product updateProduct(@PathVariable Long id , @RequestBody Product product) {return productService.updateProduct(id,product);}


    @DeleteMapping("/delete/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);  // This deletes from DB

        return ResponseEntity.ok().body(
                Map.of("message", "Product deleted successfully!")
        );
    }


}








 //Under the hood,what @RequestBody does in this line:public Product saveProduct(@RequestBody Product product) {
//        return productService.saveProduct(product);
//    } is it takes the JSON payload for example:{
                                        //  "name": "Laptop",
                                        //  "price": 1200,
                                        //  "quantity": 5}
// and then it creates a new Product object ie:Product product = new Product();
                                                //product.setName("Laptop");
                                                //product.setPrice(1200);
                                                //product.setQuantity(5);
//if @RequestBody is omitted,then Now Spring does not know where to get the Product object from. So:
//
//It won’t read the JSON in the request body. And we will end up with an error:400 Bad Request – Required request body is
//@RequestParam means that we will have a url in postman like this:http://localhost:8081/api/products/get/products/byId?productId=52
//We will have to replace 52 with the actual ID.
