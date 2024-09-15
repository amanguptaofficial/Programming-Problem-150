/*
 * 7. **Crafting Star Patterns**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Patterns  
   **Description**: Write a program to create different star patterns (e.g., pyramid, diamond).  
   **Example**:  
   Input: `patternType = "pyramid", height = 5`  
   Output:  
   ```
       *
      ***
     *****
    *******
   *********
   ```  
   Explanation: A pyramid pattern with a height of 5 is generated.
 */
public class Solution7 {

    // static void printPyramid(int row) {
    // for (int i = 1; i <= row; i++) {
    // for (int j = row - i; j > 0; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= (2 * i - 1); k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // optimize

    static void printPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            System.out.print(" ".repeat(row - i));

            System.out.print("*".repeat(2 * i - 1));

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
