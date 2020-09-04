package com.java.spring;

import com.java.spring.cdiannotation.BinarySearchCDIImpl;
import com.java.spring.withspring.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.java.spring.cdiannotation")
public class SpringCDIExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCDIExampleApplication.class, args);

		BinarySearchCDIImpl myBinarySearchCDI = applicationContext.getBean(BinarySearchCDIImpl.class);

		System.out.println(myBinarySearchCDI);

	}

}
