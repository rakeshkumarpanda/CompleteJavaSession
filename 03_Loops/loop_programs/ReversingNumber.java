package loops;

public class ReversingNumber {
    public static void main(String[] args) {
        int num = 234873;//Expected output: 378432
        int rev = 0;
        while(num > 0) {
            int rem = num%10;
            rev = (rev*10)+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
//Assignment: Check the number is pallindrome or not
//Ex. 121 -> 121 ----> Pallindrome --> If the original number = reversed number
//Ex. 123 -> 321 ----> Not pallindrome