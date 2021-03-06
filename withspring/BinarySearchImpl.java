package com.java.spring.withspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubblesort")
    private SortAlgorithm mySorting;

    public int binarySearch(int[] inputArray, int elementToSearch){

        int[] sorted = mySorting.sort(inputArray);
        // Search Element
        // Return Element
        System.out.println(mySorting);
        return 3;
    }

    @PostConstruct
    public void postConstructCalling(){
        System.out.println("Post Construct Called");
    }

    @PreDestroy
    public void preDestroyCalling(){
        System.out.println("Pre Destroy method called");
    }
}
