package com.kumara.__Spring_web_app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Product {

    private int prodId;
    private String prodName;
    private int prodPrice;
}
