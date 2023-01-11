package com.rezwanul7.poormans.foreach.t2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Programming");
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        IteratorClass myIterator = new IteratorClass(numbers);

        myIterator.forEach(new PrintConsumerClass());
        myIterator.forEach(new Print2XConsumerClass());
        // Shortcut one time usage
        myIterator.forEach(num -> System.out.println(num * 3));
    }
}
