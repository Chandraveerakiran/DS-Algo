/*
 LCM Calculation Using GCD (Euclidean Algorithm)

This code calculates the Least Common Multiple (LCM) of two numbers using
the Euclidean Algorithm to compute their Greatest Common Divisor (GCD).

--> Optimal Approach (Euclidean Algorithm)
 Logic:
- Use the Euclidean algorithm to find the GCD:
  - Repeatedly apply a % b until the remainder is 0.
- Calculate the LCM using:
  LCM(a, b) = (a × b) / GCD(a, b)

Example:
Input: 12 and 18
GCD: 6
LCM = (12 × 18) / 6 = 36

*/
// ==========================================================================
public class Lcm {
    public static void main(String[] args) {
        // Input values
        int n1 = 12;
        int n2 = 18;
        // Store original values to use in LCM calculation later
        int on1 = n1; //storing the original data so, it used for future (while calculating the LCM)
        int on2 = n2;
        // Euclidean Algorithm to calculate GCD
        while (n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        //  LCM formula: (original_n1 * original_n2) / GCD
        int lcm = (on1 * on2) / n1;

        // Output the result
        System.out.println("LCM: " + lcm);
    }
}
// ===========================================================================
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(1)
