package com.march22.predicatedemo;

// Apples that are of greem color
public class AppleGreenColorPredicateImpl implements  ApplePredicate{
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
