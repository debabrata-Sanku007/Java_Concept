package com.java.practice.interfaceexample;


public interface B {
    void print(String input);

    default void printing() {
        System.out.println("I am from B");
    }

    static void calculate() {
        System.out.println("I am from B - Static");
    }

    private void cal() {
        System.out.println("I am from private method inside B");
    }
}
