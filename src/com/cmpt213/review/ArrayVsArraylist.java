package com.cmpt213.review;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArraylist {

    public void codeWithArrays() {

        int[] arr = {1, 2, 3};
        arr[0] = 5;
        // arr.add(4);  // ERROR! Cannot expand the array

        int[] arr2 = {4, 5, 6};  // Given another array,
        arr = arr2;              // You can reassign the reference.

    }

    public void codeWithArrayLists() {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);  // Can expand the arraylist dynamically
        arrList.add(2);
        arrList.add(3);

    }

}
