package com.rezwanul7.poormans.foreach.t1;

import java.util.List;

class IteratorClass {
    List<Integer> numbers;

    public IteratorClass(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void forEach(PrintActionClass actionInterface) {
        System.out.println("Starting to loop using action class - " + actionInterface.getClass().getName());
        for (Integer num : numbers) {
            actionInterface.print(num);
        }
    }
}
