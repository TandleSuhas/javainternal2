 interface Shape {
 double calculateArea();
 double calculatePerimeter();
}
 class Circle implements Shape {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 
 public double calculateArea() {
 return Math.PI * radius * radius;
 }
 public double calculatePerimeter() {
 return 2 * Math.PI * radius;
 }
}
class Rectangle implements Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public double calculateArea() {
 return length * width;
 }
 public double calculatePerimeter() {
 return 2 * (length + width);
 }
}
public class InterfaceEx2 {
 public static void main(String[] args) {
 Shape circle = new Circle(5);
 System.out.println("Circle Area: " + circle.calculateArea());
 System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
 Shape rectangle = new Rectangle(4, 6);
 System.out.println("Rectangle Area: " + rectangle.calculateArea());
 System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
 }
}