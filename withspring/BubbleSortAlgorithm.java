package com.java.spring.withspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] inputArray) {
        // Implementation of BubbleSort algorithm
        return inputArray;
    }
}
