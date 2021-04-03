package com.company;

import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        //5 - Sum all elements of a numeric collection

        List<Integer> numbers = Arrays.asList(2, 13, 56, 7, 9);
        int sum = numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2);

        int sumALT = numbers.stream()
                .mapToInt(each -> each)
                .sum();
        System.out.println("by reduce() --> " + sum + ", by mapToInt.sum() --> " + sumALT);
    }

}
