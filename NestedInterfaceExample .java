interface OuterInterface {
 void outerMethod();
 // Nested interface
 interface NestedInterface {
 void nestedMethod();
 }
}
// Implementing class
class MyClass implements OuterInterface.NestedInterface {
 public void outerMethod() {
 System.out.println("Outer method implementation");
 }
 public void nestedMethod() {
 System.out.println("Nested method implementation");
 }
}
public class NestedInterfaceExample {
 public static void main(String[] args) {
 MyClass myClass = new MyClass();
 myClass.outerMethod();
 myClass.nestedMethod();
 }
}
