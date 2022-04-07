package com.String_Problems;
/*
Given an array of strings patterns and a string word,
return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.
Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
 */
public class _09_Strings_appear_as_Substring_in_word {
    public static void main(String[] args) {
        String[] pattern = {"a","abc","bc","d","c"};
        String word = "abc";
        System.out.println(numOfStrings(pattern, word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
