/*
Your friend is typing his name into a keyboard. Sometimes,when typing a character c,
the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard.
Return True if it is possible that it was your friends name,
with some characters (possibly none) being long pressed.

Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
 */
public class _12_Long_Pressed_Name {
    public static void main(String[] args) {
        String name = "sahil";
        String typed = "ssaahill";
        System.out.println(isLongPressedName(name, typed));
    }
    static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if(i != name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        if(i == name.length()) { return true; }
        return false;
    }
}
