package com.java.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchComponentScanImpl {

    @Autowired
    @Qualifier("bubblesort")
    private SortAlgorithmComponentScan mySorting;

    public int binarySearch(int[] inputArray, int elementToSearch){

        int[] sorted = mySorting.sort(inputArray);
        // Search Element
        // Return Element
        System.out.println(mySorting);
        return 3;
    }
}
