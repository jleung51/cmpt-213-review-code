package com.cmpt213.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Let's say this is an arbitrary string container
public class IterableImplementationExample implements Iterable<String> {

    private List<String> list;

    public IterableImplementationExample() {
        list = new ArrayList<String>();
        list.add("brian");
        list.add("fraser");
        list.add("is");
        list.add("the");
        list.add("best");
    }

    @Override
    public Iterator<String> iterator() {
        // Return some way to iterate through the container you are encapsulating
        return list.iterator();
    }

}
