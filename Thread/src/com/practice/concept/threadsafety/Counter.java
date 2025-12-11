package com.practice.concept.threadsafety;

public class Counter {

    private int count;

    public int getCountValue() {
        return count;
    }

    public synchronized void incrementCountValue() {
        count++;
    }
}
