package com.practice.concept.creation;

public class UsingRunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running Using running Runnable Interface "+Thread.currentThread().getName());
    }
}
