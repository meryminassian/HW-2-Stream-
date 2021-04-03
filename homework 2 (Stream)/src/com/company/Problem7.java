package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {

        //7 Partition adults and kids

        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);


        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = collection.stream()
                .collect(Collectors.partitioningBy(each -> each.getAge() >= 18));

        result.get(true).forEach(each -> System.out.print(each.toString() + " ")); // outputs -->victor, eva
        System.out.println();
        result.get(false).forEach(each -> System.out.print(each.getName() + " " + each.getAge() + "y.o")); //outputs sara
        System.out.println();
    }
}
