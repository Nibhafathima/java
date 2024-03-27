class Shape {
int l = 2;
int b = 2;

}

class Rectangle extends Shape {
void area() {
int c = l * b;
System.out.println("area of rectangle is " + c);

}
public static void main(String[] args) {
Rectangle obj = new Rectangle();
obj.area();
}
}
