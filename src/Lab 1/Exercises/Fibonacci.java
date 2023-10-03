public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single command line argument for the number of Fibonacci numbers to generate.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Please provide a positive integer.");
            return;
        }

        long[] fibonacciNumbers = new long[n];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (long num : fibonacciNumbers) {
            System.out.print(num + " ");
        }

        double sum = 0;
        for (long num : fibonacciNumbers) {
            sum += num;
        }

        double average = sum / n;
        System.out.println("\nThe average is " + average);
    }
}
