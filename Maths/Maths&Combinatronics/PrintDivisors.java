// Problem: Print All Divisors of a Number
// Given an integer n, return all of its divisors in a list.
// Example:
// Input: 12
// Output: [1, 2, 3, 4, 6, 12]

import java.util.ArrayList;

public class PrintDivisors {
    public static ArrayList<Integer> printDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 12;
        ArrayList<Integer> result = printDivisors(n);
        System.out.println("Divisors of " + n + ": " + result);
    }
}
