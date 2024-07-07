import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int[] sub_marks; 
    int total_marks;
    double percentage;
    Student(int rollno, String name, int[] sub_marks) {
        this.rollno = rollno;
        this.name = name;
        this.sub_marks = sub_marks;
        this.total_marks = calculateTotalMarks();
        this.percentage = calculatePercentage();
    }

    int calculateTotalMarks() {
        int total = 0;
        for (int mark : sub_marks) {
            total += mark;
        }
        return total;
    }
    double calculatePercentage() {
        return (this.total_marks * 100.0) / (sub_marks.length * 100.0); 
    }
    void display() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.print("Subject Marks: ");
        for (int mark : this.sub_marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + this.total_marks);
        System.out.println("Percentage: " + this.percentage);
    }
}
class Mooc extends Student {
    String course;
    double coursePercentage;
    Mooc(int rollno, String name, int[] sub_marks, String course, double coursePercentage) {
        super(rollno, name, sub_marks); // Fixed super call
        this.course = course;
        this.coursePercentage = coursePercentage;
    }
    void display() {
        super.display();
        System.out.println("Course: " + this.course);
        System.out.println("Course Percentage: " + this.coursePercentage);
    }
}

class Course extends Mooc {
    String courseName;
    Course(int rollno, String name, int[] sub_marks, String course, double coursePercentage, String courseName) {
        super(rollno, name, sub_marks, course, coursePercentage); // Fixed super call
        this.courseName = courseName;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Course Name: " + this.courseName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the roll no:");
        int rollno = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.println("Enter the name:");
        String name = input.nextLine();
        System.out.println("Enter the marks for 7 subjects:");
        int[] sub_marks = new int[7];
        for (int i = 0; i < 7; i++) {
            sub_marks[i] = input.nextInt();
        }
         input.nextLine();
         System.out.println("Enter the course:");
         String course = input.nextLine();
         System.out.println("Enter the course percentage:");
        double coursePercentage = input.nextDouble();
        input.nextLine(); 
        System.out.println("Enter the course name:");
        String courseName = input.nextLine();

        Course obj = new Course(rollno, name, sub_marks, course, coursePercentage, courseName);
        obj.display();
    }
}
