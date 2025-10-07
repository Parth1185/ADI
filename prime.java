class prime {
    public static boolean primeCheck(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 23;
        boolean result = primeCheck(num);

        if (result)
            System.out.println("Is " + num + " prime: Yes");
        else
            System.out.println("Is " + num + " prime: No");
    }
}