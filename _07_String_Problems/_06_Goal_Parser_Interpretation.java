package com.String_Problems;
/*
You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Eg: Input: command = "G()()()()(al)"
    Output: "Gooooal"
 */
public class _06_Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String goal = "G()(al)()()";
        System.out.println(interpret(goal));
    }
    static String interpret(String command) {
        StringBuilder list = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                list.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                list.append("o");
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                list.append("al");
            }
        }
        String ans = list.toString();
        return ans;
    }
}
