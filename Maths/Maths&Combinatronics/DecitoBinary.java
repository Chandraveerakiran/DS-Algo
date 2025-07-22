/*
📌 Problem: Convert Decimal to Binary

▶️ Example:
Input: 12
Output: Binary: 1100

  Approach:
- Keep dividing the number `n` by 2.
- Store the remainder of each division (which will be either 0 or 1).
- Append each remainder to the front of a string to build the binary representation in correct order.

Code:
*/
==================================================================
public class DecitoBinary {
    public static void main(String[] args) {
        int n = 12;          // Input number
        String binary = "";  // String to store binary result

        while (n != 0) {
            int rem = n % 2;   // Get remainder (Here in java we can also use Bit-operators by AND -> n & 1 (which gives the remainder))
            binary = rem + binary;      // Append at beginning
            n = n / 2;    // updating n (By  Signed right shift operator (n>>1) we can extract the quotient , form of internally -> x / (2ⁿ), Only works for even num's)

        }

        System.out.println("Binary: " + binary);
    }
}
===================================================================

//  Time Complexity: O(log₂ n)
//  Space Complexity: O(log₂ n)

//  Explanation:
// - 12 / 2 = 6, remainder = 0
// - 6 / 2 = 3, remainder = 0
// - 3 / 2 = 1, remainder = 1
// - 1 / 2 = 0, remainder = 1
// => Binary = 1100

