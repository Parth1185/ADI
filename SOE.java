// Sieve of Eratosthenes implementation

import java.util.*;

public class SOE {
    public static List<Integer> fun1(int n) {
        List<Integer> ans = new ArrayList<>();    
        boolean[] isPrime = new boolean[n + 1]; // n+1 because we want to include n
        for(int i = 2; i <= n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }
        
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                ans.add(i); // Collecting all prime numbers
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fun1(100));
    }
}
