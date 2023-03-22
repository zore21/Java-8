package com.march22.formatterdemo;

public class AppleFancyFormatterImpl implements AppleFormatter{
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ?
                "heavy" : "light";
        return "A "+
                characteristic+
                "" + apple.getColor()+" apple";
    }
}
