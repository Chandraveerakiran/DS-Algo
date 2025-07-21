/*
 * Problem:
 *   This program divides two integers a and b,
 *   then finds the floor and ceiling of the result (a / b).
 *   The output is returned as an ArrayList containing [floor, ceil].
 * 
  Example:
 *     Input: a = 5, b = 3
 *     Output: [1, 2]
 *     Explanation: 5 / 3 = 1.66 → floor = 1, ceil = 2
 */
===========================================================
import java.util.*;
public class FloorCeilOfDivision {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Convert to double for accurate floating-point division
        double c = (double) a / b;

        // Use Math.floor and Math.ceil and cast to int
        int floor = (int) Math.floor(c); // Largest integer <= c
        int ceil = (int) Math.ceil(c);   // Smallest integer >= c

        // Store result in an ArrayList
        ArrayList<Integer> res = new ArrayList<>();
        res.add(floor);
        res.add(ceil);

        // Print the result
        System.out.println("Floor and Ceil of " + a + "/" + b + ": " + res);
    }
}
===============================================================
// Time Complexity: O(1) – Constant time division and math operations
// Space Complexity: O(1) – Uses only basic variables and a result list of size 2


