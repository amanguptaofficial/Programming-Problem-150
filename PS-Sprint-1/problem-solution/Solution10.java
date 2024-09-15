/*10. **Finding the Greatest Common Divisor (GCD)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the GCD of two numbers.  
    **Example**:  
    Input: `a = 48, b = 18`  
    Output: `6`  
    Explanation: The GCD of 48 and 18 is 6. */
public class Solution10 {

    public static int findGCD(int a, int b) {
        while (b!= 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int gcd = findGCD(48, 18);
        System.out.println(gcd);
    }
}
