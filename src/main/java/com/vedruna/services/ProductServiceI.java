package com.vedruna.services;

import java.util.List;

import com.vedruna.persistance.models.Product;

public interface ProductServiceI {
    List<Product> showAllProducts();
    Product showProductByProductName(String productName);
    void saveProduct(Product product);
    void deleteProduct(Long productId);
    void updateProduct(Long productId,Product product);
}
