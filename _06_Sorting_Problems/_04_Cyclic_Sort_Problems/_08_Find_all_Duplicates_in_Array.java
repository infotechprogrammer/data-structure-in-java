package com.Sorting_Problems._04_Cyclic_Sort_Problems;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an integer array nums of length n where all the integers of nums
are in the range [1, n] and each integer appears once or twice,
return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
 */
public class _08_Find_all_Duplicates_in_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Duplicate Elements: "+ findDuplicates(arr));
    }
    static ArrayList<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

        // just find missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
