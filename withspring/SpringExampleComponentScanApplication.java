package com.java.spring.withspring;

import com.java.spring.componentscan.BinarySearchComponentScanImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.java.spring.componentscan")
public class SpringExampleComponentScanApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleComponentScanApplication.class, args);

		BinarySearchComponentScanImpl myBinaryCompScanSearch1 = applicationContext.getBean(BinarySearchComponentScanImpl.class);
		System.out.println(myBinaryCompScanSearch1);

	}

}
