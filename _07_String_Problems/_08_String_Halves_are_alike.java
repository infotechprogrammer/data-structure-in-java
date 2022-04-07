/*
You are given a string s of even length. Split this string into two halves of equal lengths,
and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels
('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.

Example 1:
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 */
public class _08_String_Halves_are_alike {
    public static void main(String[] args) {
        String text = "book";
        System.out.println(halvesAreAlike(text));
    }
    static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);
        if(checkVowel(s1) == checkVowel(s2)) {
            return true;
        }
        return false;
    }
    static int checkVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch=='e'||ch=='i' || ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                count++;
            }
        }
        return count;
    }
}
