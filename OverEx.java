class Animal {
 public void sound() {
 System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {
 public void sound() {
 System.out.println("Dog barks");
 }
 
 public void sound(int frequency) {
 System.out.println("Dog barks at " + frequency + " Hz");
 }
}
public class OverEx {
 public static void main(String[] args) {
 Animal animal = new Animal();
 animal.sound(); // Output: Animal makes a sound
 
 Dog dog = new Dog();
 dog.sound(); // Output: Dog barks
 
 dog.sound(100); // Output: Dog barks at 100 Hz
 
 Animal dog2 = new Dog();
 dog2.sound(); // Output: Dog barks (method overriding)
 }
}
