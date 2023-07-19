package com.zikan.searchrestapi.service.impl;

import com.zikan.searchrestapi.entity.Product;
import com.zikan.searchrestapi.repository.ProductRepository;
import com.zikan.searchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        productRepository.searchProducts(query);
    }
}
