/*
You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.

Eg-1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class _05_Shuffle_String {
    public static void main(String[] args) {
        String name = "hilSa";
        int[] name_index = {2,3,4,0,1};
        System.out.println(restoreString(name,name_index));
    }
    static String restoreString(String s, int[] indices) {
        // Converting String s into Character Array
        char[] ch=s.toCharArray();

        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }

        // Converting Array into String

        s=String.valueOf(ch);
        return s;
    }
}
