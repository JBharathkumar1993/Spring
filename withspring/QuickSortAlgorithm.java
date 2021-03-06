package com.java.spring.withspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quicksort")
//@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] inputArray) {
        return inputArray;
    }
}
