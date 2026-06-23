package com.kumara.__Spring_web_app.service;

import com.kumara.__Spring_web_app.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class ProductService {

   List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"bat",500),new Product(102,"ball",80),new Product(103,"glove",1200)));

    public List<Product> getProducts(){
        return  products;
    }

    public Product getProductById(int prodId) {
        return products.stream().
                filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
}
