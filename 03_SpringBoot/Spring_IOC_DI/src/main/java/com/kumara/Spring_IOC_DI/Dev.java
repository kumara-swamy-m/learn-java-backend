package com.kumara.Spring_IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev {
    @Autowired     //Field Injection
    @Qualifier("laptop")
    private Computer comp;

//    public Dev(Laptop laptop){   Constructor Injection
//        this.laptop=laptop;
//    }

//    @Autowired                                 Setter Injection
//    public void setter(Laptop laptop){
//        this.laptop=laptop;
//    }

    public void build(){
        System.out.println("Building.......");
        comp.compile();

    }


}
