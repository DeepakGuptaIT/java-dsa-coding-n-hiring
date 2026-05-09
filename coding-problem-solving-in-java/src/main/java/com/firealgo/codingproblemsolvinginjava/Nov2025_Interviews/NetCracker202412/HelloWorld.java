package com.firealgo.codingproblemsolvinginjava.Nov2025_Interviews.NetCracker202412;

import java.util.Comparator;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello");
        //
        var fruits = List.of(
                new Fruits("Apple", "Red", 100),
                new Fruits("Banana", "Yellow", 20),
                new Fruits("Strawberry", "Red", 150),
                new Fruits("Guava", "Green", 80),
                new Fruits("Papaya", "Yellow", 40)
        );
        // 1. Print names of all the red fruits
        fruits.stream()
                .filter(e -> e.color().equals("Red")).map(Fruits::name).forEach(e -> System.out.println(e));

//        2. Sort fruits by ascending price.Then, print name and price of each fruit
//        (such that cheapest fruit comes first)
        fruits.stream()
                .sorted(Comparator.comparing(Fruits::price)).forEach(e-> {
                    System.out.println("name = "+ e.name() +" and price= "+ e.price());
                });


    }
}

record Fruits(String name, String color, int price) {

}



