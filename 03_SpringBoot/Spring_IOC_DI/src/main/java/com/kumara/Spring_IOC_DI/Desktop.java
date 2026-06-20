package com.kumara.Spring_IOC_DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //To choose between the two classes implementing the Computer interface or can implememt at calling class by Qualifier
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling with Desktop");
    }
}
