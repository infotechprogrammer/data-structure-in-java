package com.Sorting_Problems._02_Selection_Sort;

import java.util.Arrays;

public class _02_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionMin(arr);
//        selectionMax(arr); // You can also use this function it will do selection sort by considering minimum element to place at right index(place)
        System.out.println(Arrays.toString(arr));
    }

    // Selection sort by taking max element
    static void selectionMax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Selection sort by taking min element
    static void selectionMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the minimum item in the remaining array and swap with correct index
            int start = i;
            int minIndex = getMinIndex(arr, start , arr.length-1);
            swap(arr, minIndex, start);
        }
    }
    static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for(int i = start; i <= end; i++) {
            if(arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
