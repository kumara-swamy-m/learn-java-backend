package com.kumara.__Spring_JDBC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Alien {
     private int id;
     private String name;
     private String tech;



}
