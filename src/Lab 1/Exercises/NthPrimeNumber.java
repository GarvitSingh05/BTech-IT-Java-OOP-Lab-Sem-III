public class NthPrimeNumber {
    public static void main(String[] args) {
        int n = 10, count = 0, num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }

        System.out.println("The " + n + "th prime number is: " + (num - 1));
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
