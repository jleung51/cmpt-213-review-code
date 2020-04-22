package com.cmpt213.review;

public class ComparableImplementationExample implements Comparable<ComparableImplementationExample> {

    private String name = "CMPT 213";

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ComparableImplementationExample o) {
        // Some algorithm which compares the two objects to each other
        return name.compareTo(o.getName());
    }


}
