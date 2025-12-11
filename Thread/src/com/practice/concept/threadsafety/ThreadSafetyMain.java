package com.practice.concept.threadsafety;

public class ThreadSafetyMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        //Creating Two thread and sharing the same resource
        CustomThread t1 = new CustomThread(counter);
        CustomThread t2 = new CustomThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCountValue());

    }
}
