package com.java.spring.cdiannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quicksort")
//@Primary
public class QuickSortCDIAlgorithm implements SortAlgorithmCDI {

    @Override
    public int[] sort(int[] inputArray) {
        return inputArray;
    }
}
