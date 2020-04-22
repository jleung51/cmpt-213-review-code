package com.cmpt213.review;

import java.io.File;
import java.io.FileFilter;

public class AnonymousClassExample {

    public void createAnonymousObject() {
        FileFilter anonymousObjectExample1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // Do something
                return false;
            }
        };

        // Use anonymousObjectExample1 in something
    }

    public void createAnonymousObjectInlineAsParameter() {

        File[] files = new File("pathname").listFiles(

                // This is the anonymous class, placed inline where its usage is
                new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        // Do something
                        return false;
                    }
                }

        );

    }



    // Alternative to an anonymous class: Define a normal class which implements the same interface.
    // No longer an anonymous class.

    public void alternativeToAnonymousClass() {
        File[] files = new File("pathname").listFiles(
                new DirectoryFileFilter()
        );
    }

    // One example
    public static class DirectoryFileFilter implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.isDirectory();
        }
    }

    // Another example
    public static class JavaFileFilter implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().endsWith(".java");
        }
    }

}
