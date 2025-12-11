package com.practice.concept.threadsafety;

public class CustomThread extends Thread {

    private Counter counter;

    public CustomThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementCountValue();
        }
    }
}
