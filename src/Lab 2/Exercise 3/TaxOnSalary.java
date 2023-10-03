import java.util.Scanner;

public class TaxOnSalary {
    private double salary;
    private boolean isPANsubmitted;

    // Constructor when isPANsubmitted is provided
    public TaxOnSalary(boolean isPANsubmitted) {
        this.isPANsubmitted = isPANsubmitted;
        this.salary = 1000.00; // Default initial value for salary
    }

    // Constructor when no values are provided
    public TaxOnSalary() {
        this.isPANsubmitted = false; // Default initial value for isPANsubmitted
        this.salary = 0.0; // Default initial value for salary
    }

    // Accessor methods
    public double getSalary() {
        return salary;
    }

    public boolean isPANsubmitted() {
        return isPANsubmitted;
    }

    // Method to calculate tax based on salary
    public double calculateTax() {
        if (salary < 180000) {
            if (isPANsubmitted) {
                return 0.0;
            } else {
                return 0.05 * salary;
            }
        } else if (salary < 500000) {
            return 0.1 * salary;
        } else if (salary < 1000000) {
            return 0.2 * salary;
        } else {
            return 0.3 * salary;
        }
    }

    // Method to input salary from the user
    public void inputSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        salary = scanner.nextDouble();
    }

    public static void main(String[] args) {
        TaxOnSalary taxCalculator = new TaxOnSalary(true); // Creating instance with PAN submitted
        System.out.println("Salary: " + taxCalculator.getSalary());
        System.out.println("PAN Submitted: " + taxCalculator.isPANsubmitted());
        taxCalculator.inputSalary(); // Input new salary
        System.out.println("Tax: " + taxCalculator.calculateTax());
    }
}
