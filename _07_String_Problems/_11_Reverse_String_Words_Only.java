package com.String_Problems;
/*
Given a string s, reverse the order of characters in each word within a sentence
while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class _11_Reverse_String_Words_Only {
    public static void main(String[] args) {
        String text = "Let's Study Today";
        System.out.println(reverseWords(text));
    }
    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String[] result = sb.toString().split(" ");
        for(int i=0,j=result.length-1;i<=j;i++,j--){
            String temp = result[j];
            result[j] = result[i];
            result[i] = temp;
        }
        return String.join(" ", result);
    }
}
