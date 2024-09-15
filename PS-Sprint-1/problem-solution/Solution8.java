/*
 * 8. **Finding the Factorial of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to compute the factorial of a given number.  
   **Example**:  
   Input: `number = 5`  
   Output: `120`  
   Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.  
 */
public class Solution8 {

    // by recusion
    public static int findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * findFactorial(n - 1);

    }

    public static void main(String[] args) {
        int factorial = findFactorial(5);
        System.out.println(factorial);
    }
}
