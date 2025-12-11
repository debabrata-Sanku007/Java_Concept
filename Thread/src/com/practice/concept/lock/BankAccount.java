package com.practice.concept.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private final Lock lock = new ReentrantLock();
    private int balance = 100;

    //Why we are not using synchronize keyword in here. as if one thread is enter this method,
    // and it takes too many times then others Threads are block
    // until it finish his work, So granular level control we can use this ReentrantLock.

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        // Now other thread is wait for 3 second, if they get the lock then enter the critical section or else proceed.
        //No wait for previous thread.
        if (lock.tryLock(3, TimeUnit.SECONDS)) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " proceeding withdraw.. ");
                balance -= amount;
                Thread.sleep(5000);//consider this sleep for database transaction
                System.out.println(Thread.currentThread().getName() + " Remaining Balance " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " Insufficient balance.. ");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " Could not acquire the lock ");
        }
    }

}
