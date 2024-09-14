/**
 * 2. **Checking for Prime Numbers**
 ** Difficulty**: Easy
 ** Topics**: Basic Programming, Number Theory
 ** Description**: Write a program to determine if a number is prime.
 ** Example**:
 * Input: `number = 7`
 * Output: `Prime`
 * Explanation: 7 has no divisors other than 1 and itself, so it is a prime
 * number.
 **/

public class Solution2 {

    // public static boolean isPrime(int n) {
    // int count = 0;
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // count++;
    // }
    // if (count > 2) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = isPrime(50);
        System.out.println("Given Number is prime: " + ans);
    }
}
