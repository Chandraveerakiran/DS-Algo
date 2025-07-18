// ✅ Check if a number is a perfect number using optimized divisor check
// A perfect number is a number that is equal to the sum of its proper divisors (excluding itself)
====================================
// ✅ Logic:(Bruthforce)-approach TC:O(n) SC:O(1)
// -Traverse From 1->N 
// -Check the divisors and make a count 
// -if count ==n return true 
===================================
public class PerfectNum{
    public static void main(String[] args) {
        int n = 8128;
        int c = 1; // 1 is always a divisor of any number (except 0)

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                c += i;
                if (i != n / i) {
                    c += n / i; // Add the paired divisor
                }
            }
        }

        if (c == n) {
            System.out.println("true"); 
        } else {
            System.out.println("false");
        }
    }
}
=======================================================
// ✅ Logic:(Optimized)-approach
// - Starts from 2 to √n to find divisors.
// - Adds both `i` and `n/i` when a divisor is found.
// - `1` is added directly as it is always a proper divisor.
// - Skips `n` itself.
// /*
// 🧠 Time Complexity: O(√n)
//    → Because we iterate from 2 to √n and check for divisors.

// 📦 Space Complexity: O(1)
//    → Only constant space is used (no extra arrays or data structures).
// */
========================================================
