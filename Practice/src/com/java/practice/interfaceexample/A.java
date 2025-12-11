package com.java.practice.interfaceexample;


public interface A {
    void print(String input);

    public default void printing1() {
        System.out.println("I am from A" + cal(2, 2));
    }

    public static void calculate() {
        System.out.println("I am from A - Static");
    }

    private int cal(int a, int b) {
        return a + b;
    }
}
