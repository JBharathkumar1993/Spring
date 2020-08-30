package com.java.spring.withoutspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);

		BinarySearchImpl myBinarySearch_1 = new BinarySearchImpl(new BubbleSortAlgorithm());
		System.out.println(new BubbleSortAlgorithm());

		BinarySearchImpl myBinarySearch_2 = new BinarySearchImpl(new QuickSortAlgorithm());
		System.out.println(new QuickSortAlgorithm());

		System.out.println(myBinarySearch_1.binarySearch(new int[]{1, 3, 4, 2}, 10));

	}

}
