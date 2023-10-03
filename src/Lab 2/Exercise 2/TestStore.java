import java.util.Scanner;

public class TestStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Customer instance
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer idNo: ");
        String customerIdNo = scanner.nextLine();

        System.out.print("Enter customer balance: ");
        double customerBalance = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline

        Customer customer = new Customer(customerName, customerIdNo, customerBalance);

        // Create two Item instances
        Item[] items = new Item[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Enter itemName: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter itemidNo: ");
            String itemIdNo = scanner.nextLine();

            System.out.print("Enter itemQuantity: ");
            int itemQuantity = scanner.nextInt();

            System.out.print("Enter itemPrice: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline

            items[i] = new Item(itemName, itemIdNo, itemQuantity, itemPrice);
        }

        // Buy items for the customer
        for (Item item : items) {
            customer.buyItem(item);
        }

        scanner.close();
    }
}
