//Exercise 2.1 from Strings, StringBuilder, StringTokeniser

import java.io.IOException;

class Name {
    private String fname;
    private String mname;
    private String lname;

    Name(String name) {
        String[] parts;
        if (name.contains(",")) {
            parts = name.split(",");
        } else {
            parts = name.split(";");
        }

        fname = parts[0].trim();
        mname = parts[1].trim();
        lname = parts[2].trim();
    }

    public String getFirstName() {
        return fname;
    }

    public String getMiddleName() {
        return mname;
    }

    public String getLastName() {
        return lname;
    }

    public String getName() {
        return fname + " " + mname + " " + lname;
    }

    public String toString() {
        return fname + mname + lname;
    }
}

class Student {
    private Name name; 
    private int age;   

    Student(Name name, int age) {
        this.name = name;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name.getName() + " " + age;
    }
}

class StudentList {
    public static Student[] list = new Student[10]; 
    public static int count = 0;

    public static void addStudent(Student std) {
        if (count >= 10) 
        return; 
        list[count] = std;
        count++;
    }

    public static Student[] getStudentsWithAge(int age) {
        
        int matchingCount = 0;
        for (Student student : list) {
            if (student != null && student.getAge() == age) {
                matchingCount++;
            }
        }

        if (matchingCount == 0) {
            return null;
        }

        Student[] matchingStudents = new Student[matchingCount];
        int index = 0;
        for (Student student : list) {
            if (student != null && student.getAge() == age) {
                matchingStudents[index++] = student;
            }
        }

        return matchingStudents;
    }

    public static Student[] getStudentsWithLastName(String lastName) {
        int matchingCount = 0;
        for (Student student : list) {
            if (student != null && student.getName().getLastName().equals(lastName)) {
                matchingCount++;
            }
        }

        if (matchingCount == 0) {
            return null;
        }

        Student[] matchingStudents = new Student[matchingCount];
        int index = 0;
        for (Student student : list) {
            if (student != null && student.getName().getLastName().equals(lastName)) {
                matchingStudents[index++] = student;
            }
        }

        return matchingStudents;
    }

    public static Student[] getStudentsInRange(int minAge, int maxAge) {
        int matchingCount = 0;
        for (Student student : list) {
            if (student != null && student.getAge() >= minAge && student.getAge() <= maxAge) {
                matchingCount++;
            }
        }

        if (matchingCount == 0) {
            return null;
        }

        Student[] matchingStudents = new Student[matchingCount];
        int index = 0;
        for (Student student : list) {
            if (student != null && student.getAge() >= minAge && student.getAge() <= maxAge) {
                matchingStudents[index++] = student;
            }
        }

        return matchingStudents;
    }
}

public class Test {
    public static Student readStudent() throws IOException {
        System.out.println("Enter student details:");
        String firstName = System.console().readLine("First Name: ");
        String middleName = System.console().readLine("Middle Name: ");
        String lastName = System.console().readLine("Last Name: ");
        int nameFormat = Integer.parseInt(System.console().readLine("Name format (1 for comma, 2 for semicolon): "));
        int age = Integer.parseInt(System.console().readLine("Age: "));

        Name name;
        if (nameFormat == 1) {
            name = new Name(firstName + "," + middleName + "," + lastName);
        } else {
            name = new Name(lastName + ";" + middleName + ";" + firstName);
        }

        return new Student(name, age);
    }

    public static void main(String args[]) throws IOException {

        for (int i = 0; i < 10; i++) {
            Student student = readStudent();
            StudentList.addStudent(student);
        }

        System.out.println("Students with age 20:");
        Student[] studentsWithAge20 = StudentList.getStudentsWithAge(20);
        if (studentsWithAge20 != null) {
            for (Student student : studentsWithAge20) {
                System.out.println(student.toString());
            }
        } else {
            System.out.println("No students with age 20 found.");
        }

        System.out.println("Students with last name Sharma:");
        Student[] studentsWithLastNameSharma = StudentList.getStudentsWithLastName("Sharma");
        if (studentsWithLastNameSharma != null) {
            for (Student student : studentsWithLastNameSharma) {
                System.out.println(student.toString());
            }
        } else {
            System.out.println("No students with last name Sharma found.");
        }

        System.out.println("Students with age in the range 16 to 20:");
        Student[] studentsInRange = StudentList.getStudentsInRange(16, 20);
        if (studentsInRange != null) {
            for (Student student : studentsInRange) {
                System.out.println(student.toString());
            }
        } else {
            System.out.println("No students found in the specified age range.");
        }
    }
}