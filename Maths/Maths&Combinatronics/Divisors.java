class Divisors{
    public static void main(String[] args){
        int n=36;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                System.out.println(n/i);
            }
            }
        }
    }
}
/*
 * ✅ Problem: Find all divisors of a given number
 *  brute force: Check all possible divisors from 1 to n (Can't handles large number) TC-O(n)
 * ✨ Approach: Optimized Square Root Method TC - O(√n)

 
 * 🔍 Description:
 * This program prints all the divisors of a given number `n`.
 * Instead of checking all numbers from 1 to n, we use a loop from 1 to √n.
 * For every i such that n % i == 0, both i and (n / i) are divisors.
 * This reduces the time complexity from O(n) to O(√n).
 *
 * 📌 Example:
 * Input: 36
 * Output: 1 36 2 18 3 12 4 9 6
 * 
 * ⏱️ Time Complexity: O(√n)
 * 📦 Space Complexity: O(1)
 */
