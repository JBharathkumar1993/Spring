package com.java.spring.withspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubblesort")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] inputArray) {
        // Implementation of BubbleSort algorithm
        return inputArray;
    }
}
