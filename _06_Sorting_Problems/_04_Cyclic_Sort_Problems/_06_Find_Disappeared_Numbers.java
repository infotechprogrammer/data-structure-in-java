package com.Sorting_Problems._04_Cyclic_Sort_Problems;
/*
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 */
import java.util.ArrayList;
public class _06_Find_Disappeared_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else { i++; }
        }

        // just find missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(index + 1);
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
