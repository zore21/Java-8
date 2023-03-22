package com.march22.predicatedemo;

// Apples that are heavy than 150
public class AppleHeavyWeightPredicateImpl implements ApplePredicate{
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
