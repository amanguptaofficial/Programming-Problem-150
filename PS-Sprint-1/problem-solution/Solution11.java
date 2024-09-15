/*11. **Finding the Least Common Multiple (LCM)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the LCM of two numbers.  
    **Example**:  
    Input: `a = 12, b = 15`  
    Output: `60`  
    Explanation: The LCM of 12 and 15 is 60. */

public class Solution11 {
    public static int findLCM(int a, int b) {
        int on1 = a;
        int on2 = b;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int lcm = (on1 % on2) / a;
        return lcm;
    }

    public static void main(String[] args) {
        int lcm = findLCM(12, 15);
        System.out.println(lcm);
    }
}
