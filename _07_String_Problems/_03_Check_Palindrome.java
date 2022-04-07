/*
Check whether String is palindrome or not
Eg1: abcdcba (true , it is palindrome)
Eg2: abccab (false , it is not palindrome)
 */
public class _03_Check_Palindrome {
    public static void main(String[] args) {
        String str = "null";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0; i<= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
