package com.march22.predicatedemo;

public class AppleGreenAndHeavyPredicateImpl implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 &&
                "green".equals(apple.getColor());
    }
}
