package com.java.practice.equals;

import java.util.Objects;

public class Employee {
    public int id;
    public String name;

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (e.id == this.id) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
