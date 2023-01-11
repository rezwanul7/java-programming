package com.rezwanul7.poormans.foreach.t1;

import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Resembling Foreach");
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        IteratorClass myObj = new IteratorClass(numbers);
        myObj.forEach(new PrintActionClass());
    }
}
