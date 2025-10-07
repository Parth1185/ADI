// import java.util.*;

// public class printPrime {

//     public static boolean isPrime(int n) {
//         if (n < 2) return false;
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static List<Integer> fun1(int n) {
//         List<Integer> primes = new ArrayList<>();
//         for (int i = 1; i <= n; i++) {
//             if (isPrime(i)) primes.add(i);
//         }
//         return primes;
//     }

//     public static void main(String[] args) {
//         System.out.println(fun1(100));
//     }
// }

import java.util.*;

public class printPrime {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> fun1(int n) {
        List<Integer> primes = new ArrayList<>();

        return primes;
    }

    public static void main(String[] args) {
        System.out.println(fun1(100));
    }
}
