import java.util.Scanner;

public class TestTax {
    public static void main(String[] args) {
        // Create two instances of TaxOnSalary with different initializations
        TaxOnSalary tax1 = new TaxOnSalary(true);
        TaxOnSalary tax2 = new TaxOnSalary();

        // Input salary for tax1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary for tax1: ");
        double salary1 = scanner.nextDouble();
        tax1.inputSalary();

        // Input salary for tax2
        System.out.print("Enter salary for tax2: ");
        double salary2 = scanner.nextDouble();
        tax2.inputSalary();

        // Calculate and display tax for tax1
        double taxAmount1 = tax1.calculateTax();
        System.out.println("Tax for tax1: " + taxAmount1);

        // Calculate and display tax for tax2
        double taxAmount2 = tax2.calculateTax();
        System.out.println("Tax for tax2: " + taxAmount2);
    }
}
