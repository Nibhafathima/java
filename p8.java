import java.util.Scanner;
class Vehicles{
String manufacture;
String color;
int year;
String model;
Vehicles(String manufacture,String color,int year,String model){
this.manufacture= manufacture;
this.color= color;
this.year=year;
this.model=model;
}
}
class car extends Vehicles{
String bodystyle;
car(String manufacture,String color,int year,String model,String bodystyle){
super(manufacture,color,year,model);
this.bodystyle=bodystyle;
}
void display(){
System.out.println("manufacture: "+manufacture);
System.out.println("color: "+color);
System.out.println("year: "+year);
System.out.println("model: "+model );
System.out.println("bodystyle: "+bodystyle);
}
}
class Vehicle {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of cars: ");
int n=sc.nextInt();
sc.nextLine();
car[] arr=new car[n];
for(int i=0;i<n;i++){
System.out.println("details of cars" +(i + 1));
System.out.println("enter the manufacture: ");
String manufacture=sc.nextLine();
System.out.println("enter the color: ");
String color=sc.nextLine();
System.out.println("enter the year: ");
int year=sc.nextInt();
sc.nextLine();
System.out.println("enter the model: ");
String model=sc.nextLine();
System.out.println("enter the bodystyle: ");
String bodystyle=sc.nextLine();
arr[i]=new car(manufacture,color,year,model,bodystyle);
}
for(int i=0;i<n;i++){
arr[i].display();
}
}
}
