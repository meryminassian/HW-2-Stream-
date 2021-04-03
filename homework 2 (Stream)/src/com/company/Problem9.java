package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem9 {
    public static void main(String[] args) {

        //9 - Return people names separated by comma
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);

        List<Person> collection = Arrays.asList(sara, viktor, eva);

        String names = collection.stream()
                .map(each -> each.getName())
                .collect(Collectors.joining(","));
        System.out.println("Names:" + names);


    }
}
