package com.java.spring.withoutspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);

		BinarySearchImpl myBinarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		System.out.println(myBinarySearch.binarySearch(new int[]{1, 3, 4, 2}, 10));

	}

}
