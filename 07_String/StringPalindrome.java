package string;

public class StringPalindrome {
    public static void main(String[] args) {
        String s1 = "test";
        String revString = "";
        for (int i = s1.length()-1; i>=0; i--)
            revString += s1.charAt(i);
        if (s1.equals(revString))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
