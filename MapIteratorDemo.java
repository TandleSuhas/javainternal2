import java.util.*;
public class MapIteratorDemo {
public static void main(String[] args) {
// Creating a HashMap
Map<Integer, String> hashMap = new HashMap<>();
// Adding key-value pairs to the HashMap
hashMap.put(1, "Apple");
hashMap.put(2, "Banana");
hashMap.put(3, "Cherry");
// Creating a TreeMap (sorted by keys)
Map<Integer, String> treeMap = new TreeMap<>();
// Adding key-value pairs to the TreeMap
treeMap.put(3, "Cherry");
treeMap.put(1, "Apple");
treeMap.put(2, "Banana");
// Demonstrate iterating through HashMap using an Iterator
System.out.println("Iterating through HashMap using Iterator:");
Iterator<Map.Entry<Integer, String>> hashMapIterator = hashMap.entrySet().iterator();
while (hashMapIterator.hasNext()) {
Map.Entry<Integer, String> entry = hashMapIterator.next();
int key = entry.getKey();
String value = entry.getValue();
System.out.println("Key: " + key + ", Value: " + value);
}
// Demonstrate iterating through TreeMap using an Iterator
System.out.println("\nIterating through TreeMap using Iterator:");
Iterator<Map.Entry<Integer, String>> treeMapIterator = treeMap.entrySet().iterator();
while (treeMapIterator.hasNext()) {
Map.Entry<Integer, String> entry = treeMapIterator.next();
int key = entry.getKey();
String value = entry.getValue();
System.out.println("Key: " + key + ", Value: " + value);
}
}
}