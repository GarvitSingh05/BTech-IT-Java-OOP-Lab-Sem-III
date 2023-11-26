class Employee {
    // Instance fields
    private String name;
    private double salary;

    // Parameterized constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nSalary: Rs." + salary;
    }
}

class Manager extends Employee {
    // Additional instance field
    private String department;

    // Parameterized constructor
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Accessor method for department
    public String getDepartment() {
        return department;
    }

    // Mutator method for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Override toString method to include department information
    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}

public class EmployeeManagerDriver {
    public static void main(String[] args) {
        // Creating instances using polymorphism
        Employee emp1 = new Employee("Aman Yadav", 50000.0);
        Employee emp2 = new Employee("Bhavuk Kathuria", 60000.0);

        Manager manager1 = new Manager("Aditya Sharma", 80000.0, "Marketing");
        Manager manager2 = new Manager("Garvit Singh", 90000.0, "HR");

        // Displaying attribute values using polymorphism
        displayEmployeeDetails(emp1);
        displayEmployeeDetails(emp2);
        displayEmployeeDetails(manager1);
        displayEmployeeDetails(manager2);
    }

    // Polymorphic method to display employee details
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:\n" + employee + "\n");
    }
}
