package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> numbersEvenDoubled = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .toList();
        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers doubled: " + numbersEvenDoubled);

        List<Integer> numbersSortedDescending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("List sorted decending: " + numbersSortedDescending);

        Integer numbersSum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of List: " + numbersSum);

        numbersEvenDoubled.forEach(number -> System.out.println(number));

        List<Integer> numbersInNewList = numbersEvenDoubled.stream().collect(Collectors.toList());
        System.out.println(numbersInNewList);



    }
}