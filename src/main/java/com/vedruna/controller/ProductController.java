package com.vedruna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.persistance.models.Product;
import com.vedruna.services.ProductServiceI;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductServiceI productMngmnt;
    
    @GetMapping
    public List<Product> getAllProducts() {
        return productMngmnt.showAllProducts();
    }

    @GetMapping("/name/{productName}")
    public Product showProductByProductName(@PathVariable String productName) {
        return productMngmnt.showProductByProductName(productName);
    }


    @PostMapping("/insert")
    public void postProduct(@RequestBody Product product) {
        productMngmnt.saveProduct(product);
    }
    
    @PutMapping("edit/{productId}")
    public void editProduct(@PathVariable Long productId, @RequestBody Product product) {
        productMngmnt.updateProduct(productId, product);

    }
    
    @DeleteMapping("delete/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productMngmnt.deleteProduct(productId);

    }

}
