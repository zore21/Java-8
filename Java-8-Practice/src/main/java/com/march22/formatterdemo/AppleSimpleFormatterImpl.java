package com.march22.formatterdemo;

public class AppleSimpleFormatterImpl implements AppleFormatter{
    public String accept(Apple apple) {
        return "An apple of "
           +apple.getWeight()+"g";
    }
}
