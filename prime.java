public class PrimeChecker {
    public static boolean isPrime(int num) {
        // Handle edge cases: 0, 1, and negative numbers are not prime
        if (num <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (num == 2) {
            return true;
        }
        // Check for divisibility by 2 (all other even numbers are not prime)
        if (num % 2 == 0) {
            return false;
        }
        // Check for divisibility by odd numbers up to the square root of num
        // Optimization: if a number has a divisor greater than its square root,
        // it must also have a divisor smaller than its square root.
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        int numberToCheck = 29;
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }
}