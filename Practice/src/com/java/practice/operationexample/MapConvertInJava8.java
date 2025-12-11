package com.java.practice.operationexample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapConvertInJava8 {
    public static void main(String[] args) {
        HashMap<String, String> studentMap = new HashMap<String, String>();

        studentMap.put("John Kevin", "Average");

        studentMap.put("Rakesh Sharma", "Good");

        studentMap.put("Prachi D", "Very Good");

        studentMap.put("Ivan Jose", "Very Bad");

        studentMap.put("Smith Jacob", "Very Good");

        studentMap.put("Anjali N", "Bad");
        //print all keys
        studentMap.keySet().stream().forEach(System.out::println);
        //print all value
        studentMap.values().stream().forEach(System.out::println);
        //convert map to arraylist
        List<Map.Entry<String, String>> studentList = studentMap.entrySet().stream().toList();
        for (Map.Entry<String, String> entry : studentList) {
            System.out.println("Data inside the list: " + entry);
        }

    }
}
