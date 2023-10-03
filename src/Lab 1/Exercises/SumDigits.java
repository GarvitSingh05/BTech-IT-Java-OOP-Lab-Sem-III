public class SumDigits {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single positive integer as a command line argument.");
            return;
        }

        String input = args[0];
        int sum = 0;

        try {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Please provide a positive integer.");
                return;
            }

            String numStr = Integer.toString(num);

            System.out.print("The sum of digits = ");
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += digit;
                if (i < numStr.length() - 1) {
                    System.out.print(digit + " + ");
                } else {
                    System.out.print(digit);
                }
            }

            System.out.println(" = " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid positive integer.");
        }
    }
}
