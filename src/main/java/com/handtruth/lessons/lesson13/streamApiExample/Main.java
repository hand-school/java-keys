package com.handtruth.lessons.lesson13.streamApiExample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Lolita", 32, Gender.FEMALE),
                new Person("Rustam", 28, Gender.MALE),
                new Person("Ilya", 58, Gender.MALE),
                new Person("Alina", 81, Gender.FEMALE),
                new Person("Anastasia", 42, Gender.FEMALE),
                new Person("Yuri", 39, Gender.MALE),
                new Person("Olga", 20, Gender.FEMALE),
                new Person("Paul", 7, Gender.MALE));

        people.forEach(System.out::println);

        System.out.println("-------------");

        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        sortedByAge.forEach(System.out::println);

        System.out.println("-------------");

        boolean allMatch = people.stream()
                .allMatch(person -> person.getName() != null);

        System.out.println(allMatch);
        System.out.println("-------------");

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge().equals(41));

        System.out.println(anyMatch);
        System.out.println("-------------");

        List<Person> femaleList = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        femaleList.forEach(System.out::println);
        System.out.println("-------------");

        people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());

        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("-------------");

        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

        System.out.println("-------------");

        List<Person> example = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .sorted(Comparator.comparing(Person::getAge))
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.toList());

        example.forEach(System.out::println);
        System.out.println("-------------");

        List<Integer> collect = people.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
