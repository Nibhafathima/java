import java.util.Scanner;
class Main{
public static void main(String args[]){
Area a1=new Area();
a1.show();}}
class Area{
void show(){
Scanner input = new Scanner(System.in);
System.out.println("enter the lenght");
int l = input.nextInt();
System.out.println("enter the breadth");
int b = input.nextInt();
int area = l*b;
int perimeter = 2*l*b;
System.out.println("Area of rectangle "+ area);
System.out.println("perimeter of rectangle "+  perimeter );
