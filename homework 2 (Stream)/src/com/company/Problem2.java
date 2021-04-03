package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2 {
    public static void main(String[] args) {
        //2 - Filter collection so that only elements with less than 4 characters are returned.

        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        List<String> expected = collection.stream()
                .filter(each -> each.length() < 4)
                .collect(Collectors.toList());
        expected.forEach(each -> System.out.print(each + " "));
        System.out.println();

        //by Stream.of
        Stream<String> lessThan4Char = Stream.of("My", "name", "is", "John", "Doe");
        lessThan4Char
                .filter(each -> each.length() < 4)
                .forEach(each -> System.out.print(each + " "));
    }
}
