package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem8 {
    public static void main(String[] args) {
        //8 - Group people by nationality

        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");


        List<Person> collction = Arrays.asList(sara, eva, viktor);

        Map<String, List<Person>> resultForNationalities = collction.stream()
                .collect(Collectors.groupingBy(each -> each.getNationality()));

        resultForNationalities.get("Norwegian").forEach(each -> System.out.print(each.getName() + " ,")); //output --> sara, eva
        System.out.println();
        resultForNationalities.get("Serbian").forEach(each -> System.out.print(each.getName() + " ,")); //output --> viktor
        System.out.println();

    }
}
