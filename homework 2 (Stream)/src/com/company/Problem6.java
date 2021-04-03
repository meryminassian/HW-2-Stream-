package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {
        //6 - Get names of all kids (under age of 18)

        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);

        List<Person> collection = Arrays.asList(sara, eva, viktor, anna);

        List<Person> kids = collection.stream()
                .filter(each -> each.getAge() < 18)
                .collect(Collectors.toList());

        kids.forEach(each -> System.out.print(each.getName() + " ")); //output -> sara, anna

    }
}
