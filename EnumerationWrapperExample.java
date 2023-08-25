import java.util.*;
public class EnumerationWrapperExample {
public static void main(String[] args) {
// Enumeration Example
Vector<String> colors = new Vector<>();
colors.add("Red");
colors.add("Green");
colors.add("Blue");
Enumeration<String> enumeration = colors.elements();
System.out.println("Enumeration Example:");
while (enumeration.hasMoreElements()) {
System.out.println(enumeration.nextElement());
}
// Wrapper Class Example
Integer num1 = Integer.valueOf(42); // Boxing
Double num2 = Double.valueOf(3.14); // Boxing
int unboxedNum1 = num1.intValue(); // Unboxing
double unboxedNum2 = num2.doubleValue(); // Unboxing
System.out.println("\nWrapper Class Example:");
System.out.println("Boxed Integer: " + num1);
System.out.println("Boxed Double: " + num2);
System.out.println("Unboxed Integer: " + unboxedNum1);
System.out.println("Unboxed Double: " + unboxedNum2);
}
}