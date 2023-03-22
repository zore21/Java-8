package com.march22.predicatedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// we can manipulate our code accorfing to our
// requirements at runtime with little bit of
// change in code

// what is actually happening here

// first we creates an interface ApplePredicate which has
// test method in it

// now we create classes that implements ApplePredicate
// our implemented class has logic implemented as our requirements
// now if requirement changes we just have to create a single class
// with our logic that implements ApplePredicate and we can call
// the constructor in main method and it works

public class FarmersApplication {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(1, "green", 138),
                new Apple(2, "red", 149),
                new Apple(3, "black", 157),
                new Apple(4, "green", 158),
                new Apple(5, "green", 168),
                new Apple(5, "red", 178)
        );

        List<Apple> greenApples = filterApples(apples, new AppleGreenAndHeavyPredicateImpl());

        System.out.println(greenApples);

    }

    // this is the method in which we are passing
    // ApplePredicate Object which value will be pass
    // when we call that method in main method or
    // wherever
    public static List<Apple> filterApples (List<Apple> inventory,
                                          ApplePredicate predicate){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}