package com.java.practice.operationexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ProgrammingExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> mapNumber = number.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(mapNumber);
        //How do you remove duplicate elements from a list using Java 8 streams?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().distinct().toList().forEach(System.out::println);
        //How do you find frequency of each character in a string using Java 8 streams?
        String example = "Karm karo Parth";
        Map<Character, Long> countMap = example.chars().filter(a -> a != ' ').mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);
        //How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stationeryCountMap = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationeryCountMap);
        //How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> list = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> numberMax = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Integer max = numberMax.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] number1 = new int[]{71, 18, 42, 21, 67, 32, 95, 14, 56, 87};
        int[] number2 = new int[]{71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 100};
        int[] sorted = IntStream.concat(Arrays.stream(number1), Arrays.stream(number2)).sorted().toArray();
        System.out.println(Arrays.toString(sorted));

    }
}


