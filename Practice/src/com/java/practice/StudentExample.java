package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Sanku", "kol"));
        list.add(new Student(2, "Neha", "kol"));
        list.add(new Student(3, "Rahul", "kol"));
        list.add(new Student(4, "Amit", "kol"));
        list.add(new Student(1, "Anku", "kol"));


        list.stream()
                .sorted(Comparator.comparing(Student::getId).reversed().thenComparing(Student::getName))
                .forEach(System.out::println);

    }
}
