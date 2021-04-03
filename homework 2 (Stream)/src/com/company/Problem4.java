package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem4 {
    public static void main(String[] args) {
        //4 -Get oldest person from the collection

        List<Person> people = Arrays.asList(new Person("person no1", 32), new Person("person no2", 41), new Person("person no3", 24));
        Person oldest = people.stream()
                .reduce(new Person("initial", 0), (Person p1, Person p2) -> p1.getAge() > p2.getAge() ? p1 : p2);

        System.out.println(oldest.getName() + " is the oldest person, who is " + oldest.getAge() + "y.o.");

        Person oldestALT = people.stream().reduce((Person p1, Person p2) -> p1.getAge() > p2.getAge() ? p1 : p2).get();
        System.out.println(oldestALT.getName() + "," + oldestALT.getAge());


    }
}
