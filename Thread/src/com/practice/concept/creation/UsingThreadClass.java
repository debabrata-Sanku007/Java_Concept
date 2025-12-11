package com.practice.concept.creation;

public class UsingThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running Using running Thread class "+Thread.currentThread().getName());
    }
}
