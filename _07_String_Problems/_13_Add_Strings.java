/*
Given two non-negative integers, num1 and num2 represented as string,
return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
You must also not convert the inputs to integers directly.

Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
 */
public class _13_Add_Strings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "346";
        System.out.println(addStrings(num1, num2));
    }
    static String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(n1>=0 || n2>=0){
            int sum =carry;
            if(n1>=0) {
                sum+=num1.charAt(n1--)-'0';
            }
            if(n2>=0) {
                sum+=num2.charAt(n2--)-'0';
            }
            ans.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0)
            ans.append(carry);
        return ans.reverse().toString();
    }
}
