package com.zikan.searchrestapi.repository;

import com.zikan.searchrestapi.entity.Product;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Long > {

//    JPQ-Query to search and filter products
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts (String query);  //search products by query methos

    //    Native-Query to search and filter products, we use table name in nativa query rather than class name
    @Query(value = "SELECT * FROM products p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Product> searchProductsSQL (String query);  //search products by query meth
}
