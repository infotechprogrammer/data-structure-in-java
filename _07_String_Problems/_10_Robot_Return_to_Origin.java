package com.String_Problems;
/*
There is a robot starting at the position (0, 0), the origin, on a 2D plane.
Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
You are given a string moves that represents the move sequence of the robot
where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
Note: The way that the robot is "facing" is irrelevant. 'R' will always make
the robot move to the right once, 'L' will always make it move left, etc.
Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:
Input: moves = "UD"
Output: true

Example 2:
Input: moves = "LL"
Output: false
 */
public class _10_Robot_Return_to_Origin {
    public static void main(String[] args) {
        String move = "LLRURD";
        System.out.println(judgeCircle(move));
    }
    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char move: moves.toCharArray()) {
            if(move == 'U') {
                y++;
            } else if(move == 'D') {
                y--;
            } else if(move == 'L') {
                x--;
            } else if(move == 'R') {
                x++;
            }
        }
        return (x == 0 && y == 0);
    }
}
