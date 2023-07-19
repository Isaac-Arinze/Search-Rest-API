package com.zikan.searchrestapi.service;

import com.zikan.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
}
