package utils;

public class Primes {
    public static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
