/*
 * 📝 Problem Statement:
 * Given an integer `num`, repeatedly add its digits until the result has only one digit.
 *
 * 📥 Example:
 * Input: num = 38
 * Process: 38 → 3 + 8 = 11 → 1 + 1 = 2
 * Output: 2
 
 *  Goal:
 * Return a single-digit number by repeatedly summing the digits of the given number.
 *
 *  Approach:
 * 1. Use a loop to sum the digits of the number.
 * 2. Repeat the process until the number becomes a single digit (i.e., less than 10).
*/
//===============================================================================================
class Adddigits {
    public static void main(String[] args) {
        int num = 10; // You can change this input for testing

        // Repeat the process until the number becomes a single digit
        while (num >= 10) {
            int c = 0; // Stores sum of digits in each round

            // Sum the digits of the current number
            while (num != 0) {
                int last = num % 10; // Extract last digit
                c = c + last;        // Add it to the sum
                num = num / 10;      // Remove last digit
            }

            num = c; // Update num with the sum to check if it's a single digit now
        }

        // Print the final single-digit result
        System.out.println(num);
    }
}

//===========================================================================================
/*
 *  Time Complexity: O(log N)
 *    - Because each digit-summing step reduces the number of digits.
      - Here, The outer loop runs constant time like 2-5 depending on num size but atleast 1 and inner loop logn times (num/10)
 *
 *  Space Complexity: O(1)
 *    - Constant space is used regardless of input size.
 */

