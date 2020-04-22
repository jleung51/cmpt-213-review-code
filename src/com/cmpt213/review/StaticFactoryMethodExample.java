package com.cmpt213.review;

public class StaticFactoryMethodExample {

    private String name;

    // Private, so not accessible from outside
    private StaticFactoryMethodExample() {
    }

    public static StaticFactoryMethodExample create() {
        StaticFactoryMethodExample obj = new StaticFactoryMethodExample();
        obj.name = "Brian Fraser";
        return obj;
    }

}
