package com.java8.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("I", "can", "do");
        String x = stringList.stream().collect(Collectors.joining(",", "?", "%"));
        System.out.println(x);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);
        List<Integer> integerList = Arrays.asList(45, 1, 2, 3, 4, 5, 7, 8, 9, 0);
        integerList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        int sum = integerList.stream().reduce(0, Integer::sum);
        System.out.println("sum " + sum);
        Double average = integerList.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("average " + average);

    }
}
