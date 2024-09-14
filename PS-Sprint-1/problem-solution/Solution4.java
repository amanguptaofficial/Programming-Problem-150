/**
 * 4. **Calculating Armstrong Numbers**
 ** Difficulty**: Easy
 ** Topics**: Basic Programming, Number Theory
 ** Description**: Write a program to check if a number is an Armstrong number.
 ** Example**:
 * Input: `number = 153`
 * Output: `Armstrong Number`
 * Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */

public class Solution4 {
    public static boolean checkArmStrong(int num) {
        int originalNum = num;
        int countDigit = 0;
        while (originalNum > 0) {
            countDigit++;
            originalNum = originalNum / 10;
        }
        int findArmstrong = 0;
        while (num > 0) {
            int rem = num % 10;
            findArmstrong = findArmstrong + (int) Math.pow(rem, countDigit);
            num = num / 10;
        }
        return findArmstrong == num;
    }

    public static void main(String[] args) {
        boolean ans = checkArmStrong(125);
        System.out.println(ans);
    }
}
