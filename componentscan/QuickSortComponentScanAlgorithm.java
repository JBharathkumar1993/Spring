package com.java.spring.componentscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
@Qualifier("quicksort")
//@Primary
public class QuickSortComponentScanAlgorithm implements SortAlgorithmComponentScan {

    @Override
    public int[] sort(int[] inputArray) {
        return inputArray;
    }
}
