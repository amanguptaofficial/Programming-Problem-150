/**
 * 1. **Determining Even/Odd Numbers**
 ** Difficulty**: Easy
 ** Topics**: Basic Programming
 ** Description**: Write a program to check whether a number is even or odd.
 ** Example**:
 * Input: `number = 4`
 * Output: `Even`
 * Explanation: Since 4 is divisible by 2, it is an even number.
 **/
public class Solution1 {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        boolean ans = isEven(10);
        System.out.println(ans);
    }
}