package com.kumara.__Spring_JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity

public class Product {
    public Product(){

    }

    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;}
