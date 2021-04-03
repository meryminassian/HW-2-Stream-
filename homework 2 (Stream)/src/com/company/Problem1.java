package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {

        //1 - Convert elements of a collection to upper case.
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        List<String> expected = collection.stream()
                .map(each -> each.toUpperCase())
                .collect(Collectors.toList());
        expected.forEach(each -> System.out.print(each + " "));
        System.out.println();


        //Stream.of
        Stream<String> UpperCase = Stream.of("My", "name", "is", "John", "Doe");
        UpperCase.map(each -> each.toUpperCase())
                .forEach(each -> System.out.print(each + " "));


    }
}
