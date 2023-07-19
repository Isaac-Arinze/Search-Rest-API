package com.zikan.searchrestapi.controller;


import com.zikan.searchrestapi.entity.Product;
import com.zikan.searchrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts (@RequestParam ("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }


}
