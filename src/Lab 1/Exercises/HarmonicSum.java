public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator = 50000;
        double sumL2R = 0.0; // sum from left-to-right
        double sumR2L = 0.0; // sum from right-to-left

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += 1.0 / denominator;
        }

        // for-loop for summing from right-to-left
        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += 1.0 / denominator;
        }

        // Find the difference and display
        double difference = sumL2R - sumR2L;

        System.out.println("Sum from left-to-right: " + sumL2R);
        System.out.println("Sum from right-to-left: " + sumR2L);
        System.out.println("Difference: " + difference);
    }
}
