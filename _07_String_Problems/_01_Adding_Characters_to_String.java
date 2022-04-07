public class _01_Adding_Characters_to_String {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) { // for loop is running for all 26 alphabets here
            char ch = (char)('a' + i); // In ASCII value of a value of i is added Eg.: 97(a) + 1 = 98(b)
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
