package com.java.practice.interfaceexample;

public class C implements A, B {
    @Override
    public void print(String input) {
        System.out.println("Input->" + input);
    }

    public static void main(String[] args) {
        C c = new C();
        c.print("test");


    }
}
