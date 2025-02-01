package loops;

public class AllEvenNumbersFrom1ToN {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) { //Time Complexity: O(n)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//Assignment: Take a number and print whether the number is prime or not
// Let the number is 5 --> Factors of 5 are 1 and 5 only ---> Having only 2 factors -> Prime
//Let the number is 4 --> Factors of 4 are 1, 2 and 4 only -> Having more than 2 factors -> Not Prime