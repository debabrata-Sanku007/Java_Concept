package com.java.practice.equals;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Sanku";
        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Sanku";

        System.out.println(e1.equals(e2));
        Set<Employee> s = new HashSet<>();
        s.add(e1);
        s.add(e2);
        System.out.println(s.size());
    }
}
