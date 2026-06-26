package com.kumara.__Spring_JPA.service;

import com.kumara.__Spring_JPA.model.Product;
import com.kumara.__Spring_JPA.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    ProductRepo repo;


    public List<Product> getProducts(){

        return  repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);

    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);
    }
}
