package com.kumara.Spring_IOC_DI;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling with Laptop");
    }
}
