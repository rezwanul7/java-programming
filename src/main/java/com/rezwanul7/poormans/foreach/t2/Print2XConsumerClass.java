package com.rezwanul7.poormans.foreach.t2;

class Print2XConsumerClass implements ConsumerInterface {
    public void accept(Integer num) {
        System.out.println(2 * num);
    }
}
