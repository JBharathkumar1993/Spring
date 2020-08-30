package com.java.spring.withspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm mySorting;

    public BinarySearchImpl(SortAlgorithm mySorting) {
        this.mySorting = mySorting;
    }

    public int binarySearch(int[] inputArray, int elementToSearch){

        int[] sorted = mySorting.sort(inputArray);
        // Search Element
        // Return Element
        System.out.println(mySorting);
        return 3;
    }
}
