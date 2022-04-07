public class _02_String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) { // for loop is running for all 26 alphabets here
            char ch = (char)('a' + i); // In ASCII value of a value of i is added Eg.: 97(a) + 1 = 98(b)
           builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());
        builder.deleteCharAt(0); // 1st character removed
        System.out.println(builder);

    }
}
