/*
 * 6. **Identifying Palindromes**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, String Manipulation  
   **Description**: Write a program to check if a string or number is a palindrome.  
   **Example**:  
   Input: `string = "radar"`  
   Output: `Palindrome`  
   Explanation: "radar" reads the same backward as forward.  
 * 
 */

public class Solution6 {

    public static boolean checkPalindrome(String str) {
        char[] ch = str.toCharArray();
        int s = 0, e = str.length() - 1;
        while (s <= e) {
            if (ch[s] != ch[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = checkPalindrome("abcba");
        System.out.println(ans);
    }
}
