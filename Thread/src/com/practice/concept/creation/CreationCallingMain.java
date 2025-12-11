package com.practice.concept.creation;

public class CreationCallingMain {
    public static void main(String[] args) {
        System.out.println("Main Method "+Thread.currentThread().getName());
        //Calling by Thread Class
        UsingThreadClass ut=new UsingThreadClass();
        ut.start();

        //Calling by Interface
        UsingRunnableInterface ur= new UsingRunnableInterface();
        Thread t1=new Thread(ur);
        t1.start();

    }
}