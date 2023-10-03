public class Student {
    private String name;
    private int rollNumber;
    private static int totalStudents;
    private static int rollNumberCounter;

    static {
        totalStudents = 0;
        rollNumberCounter = 1;
    }

    public Student(String name) {
        this.name = name;
        this.rollNumber = rollNumberCounter;
        rollNumberCounter++;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void displayTotalStudents() {
        System.out.println("\nTotal Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Garvit");
        Student student2 = new Student("Parth");

        System.out.println("Student 1 Details");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details");
        student2.displayDetails();
        
        Student.displayTotalStudents();
    }
}
