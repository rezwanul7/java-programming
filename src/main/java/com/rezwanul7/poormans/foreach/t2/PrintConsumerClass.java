package com.rezwanul7.poormans.foreach.t2;

class PrintConsumerClass implements ConsumerInterface {
    public void accept(Integer num){
        System.out.println(num);
    }
}
