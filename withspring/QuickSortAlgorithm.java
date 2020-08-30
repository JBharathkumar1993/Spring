package com.java.spring.withspring;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] inputArray) {
        return inputArray;
    }
}
