package com.java.spring.cdiannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchCDIImpl {

    @Autowired
    @Qualifier("bubblesort")
    private SortAlgorithmCDI mySorting;

    public int binarySearch(int[] inputArray, int elementToSearch){

        int[] sorted = mySorting.sort(inputArray);
        // Search Element
        // Return Element
        System.out.println(mySorting);
        return 3;
    }
}
