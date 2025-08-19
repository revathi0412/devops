public class PrimeChecker {
    public static boolean isPrime(int num) {
               if (num <= 1) {
            return false;
        }
               if (num == 2) {
            return true;
        }
             if (num % 2 == 0) {
            return false;
        }
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;            }
        }
        return true;     }

    public static void main(String[] args) {
        int numberToCheck = 29;
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }
}