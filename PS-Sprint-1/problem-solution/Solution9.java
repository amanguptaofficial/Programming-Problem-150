/**
 * 9. **Summing Digits of a Number**
 ** Difficulty**: Easy
 ** Topics**: Basic Programming, Mathematical Computations
 ** Description**: Write a program to calculate the sum of digits of a number.
 ** Example**:
 * Input: `number = 1234`
 * Output: `10`
 * Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.
 */

public class Solution9 {

    public static int sumDigit(int n) {
        int sumOfDigit = 0;
        while (n > 0) {
            int rem = n % 10;
            sumOfDigit += rem;
            n = n / 10;
        }
        return sumOfDigit;
    }

    public static void main(String[] args) {
        int sumOfDigit = sumDigit(1234569);
        System.out.println(sumOfDigit);
    }
}
