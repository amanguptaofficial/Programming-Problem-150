/*
 * 5. **Generating the Fibonacci Series**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Sequences  
   **Description**: Write a program to generate the Fibonacci series up to a given number.  
   **Example**:  
   Input: `limit = 10`  
   Output: `[0, 1, 1, 2, 3, 5, 8]`  
   Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].  
 */

public class Solution5 {

    static void printFibonicSeries(int n) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }

    public static void main(String[] args) {
        printFibonicSeries(10);
    }
}
