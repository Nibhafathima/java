import java.util.Scanner;

class Person {
    String name;
    String address;
    int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    String empId;
    String companyName;
    String qualification;
    int salary;

    Employee(String name, String address, int age, String empId, String companyName, String qualification, int salary) {
        super(name, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    Teacher(String name, String address, int age, String empId, String companyName, String qualification, int salary,
            String subject, String department, int teacherId) {
        super(name, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Emp ID: " + this.empId);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Salary: " + this.salary);
        System.out.println("Subject: " + this.subject);
        System.out.println("Department: " + this.department);
        System.out.println("Teacher ID: " + this.teacherId);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teachers:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of teacher " + (i + 1) + ": ");
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the address:");
            String address = sc.nextLine();
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter the empId:");
            String empId = sc.nextLine();
            System.out.println("Enter the company name:");
            String companyName = sc.nextLine();
            System.out.println("Enter the qualification:");
            String qualification = sc.nextLine();
            System.out.println("Enter the salary:");
            int salary = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter the subject:");
            String subject = sc.nextLine();
            System.out.println("Enter the department:");
            String department = sc.nextLine();
            System.out.println("Enter the teacherId:");
            int teacherId = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            teachers[i] = new Teacher(name, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }

        System.out.println("Teacher details: ");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
