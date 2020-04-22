package com.cmpt213.review;

import java.util.ArrayList;
import java.util.List;

public class ObserverExample {

    // I.e. The observer class
    public static class ClassWhichObserves {
        public void notifyChanges() {
            // Time to get some updates from the watched class somehow!
        }
    }



    // I.e. The subject which is being observed
    public static class ObservedClass {

        private List<ClassWhichObserves> observers = new ArrayList<>();

        private String ui = "great UI here";

        public void registerAnObserver(ClassWhichObserves obj) {
            observers.add(obj);
        }

        public void changeSomethingInUi() {
            ui = "Something changed...";

            for (ClassWhichObserves observer : observers) {
                observer.notifyChanges();
            }
        }

    }

}
