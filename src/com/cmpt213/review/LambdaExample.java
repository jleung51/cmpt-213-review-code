package com.cmpt213.review;

import java.io.File;
import java.io.FileFilter;

public class LambdaExample {

    public void example() {

        File[] files = new File("pathname").listFiles(
                filename -> filename.getName().endsWith(".java")  // This line is the lambda
        );

    }



    // Alternative to a lambda: Define a normal class which implements the same interface, or an anonymous class.
    // No longer an anonymous class.

    public void alternativeToLambda() {

        // Normal class
        File[] files1 = new File("pathname").listFiles(
                new DirectoryFileFilter()
        );

        // OR

        // Anonymous class
        File[] files2 = new File("pathname").listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        // Do something
                        return false;
                    }
                }
        );
    }

    public static class DirectoryFileFilter implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.isDirectory();
        }
    }

}
