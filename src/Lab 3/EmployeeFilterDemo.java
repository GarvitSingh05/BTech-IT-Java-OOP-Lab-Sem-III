class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public static Employee[] filterByDepartment(Employee[] employees, String targetDepartment) {
        int count = 0;

        // Count the number of employees in the target department
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(targetDepartment)) {
                count++;
            }
        }

        // Create a new array for employees in the target department
        Employee[] filteredEmployees = new Employee[count];
        int index = 0;

        // Fill the new array with employees from the target department
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(targetDepartment)) {
                filteredEmployees[index] = employee;
                index++;
            }
        }

        return filteredEmployees;
    }
}

public class EmployeeFilterDemo {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Garvit", 50000, "HR");
        employees[1] = new Employee("Ram", 60000, "IT");
        employees[2] = new Employee("Shyam", 55000, "HR");
        employees[3] = new Employee("Rahul", 70000, "IT");
        employees[4] = new Employee("Aman", 48000, "Finance");

        // Filter employees by department
        String targetDepartment = "HR";
        Employee[] hrEmployees = Employee.filterByDepartment(employees, targetDepartment);

        // Display employees in the HR department
        System.out.println("Employees in the " + targetDepartment + " department:");
        for (Employee employee : hrEmployees) {
            System.out.println("Name: " + employee.getName() + ", Salary: $" + employee.getSalary());
        }
    }
}
