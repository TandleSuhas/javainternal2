import java.util.*;
public class PriorityQueueDemo {
public static void main(String[] args) {
// Creating a PriorityQueue of integers (default min-heap)
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
// Adding elements to the PriorityQueue
priorityQueue.add(10);
priorityQueue.add(5);
priorityQueue.add(15);
priorityQueue.add(8);
priorityQueue.add(3);
// Displaying the PriorityQueue (Note: The order might not be sorted)
System.out.println("PriorityQueue: " + priorityQueue);
// Removing and displaying elements from the PriorityQueue
System.out.println("Removing elements from PriorityQueue:");
while (!priorityQueue.isEmpty()) {
int element = priorityQueue.poll();
System.out.println("Removed: " + element + ", Remaining: " + priorityQueue);
}
}
}