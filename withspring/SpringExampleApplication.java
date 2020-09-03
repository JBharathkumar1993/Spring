package com.java.spring.withspring;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleApplication.class, args);

		BinarySearchImpl myBinarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl myBinarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl myBinarySearch3 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(myBinarySearch1);
		System.out.println(myBinarySearch2);
		System.out.println(myBinarySearch3);

		

		System.out.println(myBinarySearch1.binarySearch(new int []{1,2,3,4},4));
	}

}
