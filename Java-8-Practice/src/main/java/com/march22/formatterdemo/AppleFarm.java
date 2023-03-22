package com.march22.formatterdemo;

import java.util.Arrays;
import java.util.List;

public class AppleFarm {
    public static  void prettyPrintApple(List<Apple> inventory,
                AppleFormatter appleFormatter){
        for(Apple apple : inventory) {
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(1, "green", 138),
                new Apple(2, "red", 149),
                new Apple(3, "black", 157),
                new Apple(4, "green", 158),
                new Apple(5, "green", 168),
                new Apple(5, "red", 178)
        );
        prettyPrintApple(apples, new AppleFancyFormatterImpl());
    }
}
