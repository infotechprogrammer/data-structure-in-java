/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
 */
public class _04_Defanging_an_IP_Address {
    public static void main(String[] args) {
        String IPAddress = "255.100.50.0";
        System.out.println(defangIPaddr(IPAddress));
    }
    static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<address.length();i++)
        {
            if(address.charAt(i)=='.')
                str.append("[.]");
            else
                str.append(address.charAt(i));
        }

        return str.toString();
    }
}
