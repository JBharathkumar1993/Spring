package com.java.spring.withspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleApplication.class, args);
		BinarySearchImpl myBinarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(myBinarySearch.binarySearch(new int []{1,2,3,4},4));
	}

}
