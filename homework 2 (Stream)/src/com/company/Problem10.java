package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem10 {
    public static void main(String[] args) {

        //10- reverse sorting(from the end)

        List<String> words = Arrays.asList("abc", "def", "zabc");
        List<String> reverse = words.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        reverse.forEach(each -> System.out.print(each + " "));

    }
}
