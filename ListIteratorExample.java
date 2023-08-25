import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorExample {
public static void main(String[] args) {
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");
fruits.add("Date");
// Create a list iterator
ListIterator<String> iterator = fruits.listIterator();
// Traverse the list in forward direction and print elements
System.out.println("Forward traversal:");
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
// Traverse the list in backward direction and print elements
System.out.println("\nBackward traversal:");
while (iterator.hasPrevious()) {
System.out.println(iterator.previous());
}
// Modify elements while traversing
System.out.println("\nModify while traversing:");
while (iterator.hasNext()) {
String fruit = iterator.next();
if (fruit.equals("Banana")) {
iterator.set("Orange"); // Modify the element
}
System.out.println(fruit);
}
// Print the modified list
System.out.println("\nModified list:");
System.out.println(fruits);
}
}