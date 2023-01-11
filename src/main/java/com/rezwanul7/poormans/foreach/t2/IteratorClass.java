package com.rezwanul7.poormans.foreach.t2;

import java.util.List;

public class IteratorClass {
    List<Integer> numbers;

    public IteratorClass(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void forEach(ConsumerInterface consumerInterface) {
        System.out.println("Starting to loop using action class - " + consumerInterface.getClass().getName());
        for (Integer num : numbers) {
            consumerInterface.accept(num);
        }
    }
}
