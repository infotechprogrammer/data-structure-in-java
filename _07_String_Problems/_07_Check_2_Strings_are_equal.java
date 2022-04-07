/*
Given two string arrays word1 and word2,
return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
 */
public class _07_Check_2_Strings_are_equal {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c", "d", "e"};
        String[] word2 = {"a", "bc", "de"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = new String();
        String str2 = new String();

        for (int i = 0; i < word1.length; i++) {
            str1 = str1 + word1[i];
        }

        for (int j = 0; j < word2.length; j++) {
            str2 = str2 + word2[j];
        }
        return str1.equals(str2);
    }
}
