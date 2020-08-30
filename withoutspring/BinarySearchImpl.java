package com.java.spring.withoutspring;

public class BinarySearchImpl {

    private SortAlgorithm mySorting;

    public BinarySearchImpl(SortAlgorithm mySorting) {
        this.mySorting = mySorting;
    }

    public int binarySearch(int[] inputArray, int elementToSearch){

        int[] sorted = mySorting.sort(inputArray);
        // Search Element
        // Return Element
        return 3;
    }
}
