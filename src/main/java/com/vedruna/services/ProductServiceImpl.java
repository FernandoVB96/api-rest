package com.vedruna.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.persistance.models.Product;
import com.vedruna.persistance.repository.ProductRepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI {

    @Autowired
    ProductRepositoryI productRepo;

    @Override
    public List<Product> showAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product showProductByProductName(String productName) {
        return productRepo.findByProductName(productName);
    }


    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Long productId, Product product) {
        product.setProductId(productId);
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepo.deleteById(productId);    
    }
    
}
