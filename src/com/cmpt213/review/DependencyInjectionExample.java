package com.cmpt213.review;

import java.util.ArrayList;
import java.util.List;

public class DependencyInjectionExample {

    private List<String> notDependencyInjectedList;

    private List<String> dependencyInjectedList;

    public DependencyInjectionExample(List<String> list) {

        notDependencyInjectedList = new ArrayList<>();  // Simply instantiated.

        dependencyInjectedList = list;  // This list would usually be passed in automatically
                                        // by a dependency injection framework like Spring.

    }



}
