package com.vedruna.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.persistance.models.Product;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long>{
    Product findByProductName(String productName);
}
