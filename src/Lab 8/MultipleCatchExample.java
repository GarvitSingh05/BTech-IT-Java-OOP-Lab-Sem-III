public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            int result = 10 / array[0]; // This will throw an ArithmeticException if array[0] is 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
