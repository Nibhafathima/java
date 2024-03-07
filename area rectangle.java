import java.util.Scanner;

class Rect {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the length:");
int length = input.nextInt();
System.out.println("Enter the breadth:");
int breadth = input.nextInt();
int area = length * breadth;
System.out.println("Area of the rectangle: " + area);
}
}
