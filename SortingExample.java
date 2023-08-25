import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingExample {
public static void main(String[] args) {
// Create a list of integers
List<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(2);
numbers.add(8);
numbers.add(1);
numbers.add(3);
// Print the original list
System.out.println("Original list: " + numbers);
// Sort the list in ascending order
Collections.sort(numbers);
// Print the sorted list
System.out.println("Sorted list (ascending): " + numbers);
// Sort the list in descending order using reverseOrder() comparator
Collections.sort(numbers, Collections.reverseOrder());
// Print the sorted list
System.out.println("Sorted list (descending): " + numbers);
}
}