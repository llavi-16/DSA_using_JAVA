class Solution1 {
    public static void printPrimeFactorization(int n) {
        // First, divide out all factors of 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // Now check for odd factors from 3 onwards
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is still greater than 2, it's a prime number
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
