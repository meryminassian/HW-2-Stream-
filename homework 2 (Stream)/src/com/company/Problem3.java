package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {
    public static void main(String[] args) {

        //3 - Flatten multidimensional collection (read about .flatMap non-terminal operation and use it)

        List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
        List<String> expected = collection.stream()
                .flatMap(each -> each.stream())
                .collect(Collectors.toList());
        expected.forEach(each -> System.out.print(each + " "));


    }
}
