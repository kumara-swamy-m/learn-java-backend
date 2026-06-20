package com.kumara.Spring_IOC_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIocDiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringIocDiApplication.class, args);
		Dev obj=context.getBean(Dev.class,args);
		obj.build();
	}

}
