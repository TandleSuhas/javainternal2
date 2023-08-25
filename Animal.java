class Animal {
public void sound(){
System.out.println("Animal makes a sound");
}
  Animal()
{
  System.out.println("Constructor1");
}
Animal (String s)
{
 System.out.println("name is "+s);
}
class Dog extends Animal{
public void sound(int frequency){
System.out.println("Dog barks at"+frequency+"Hz");
}
}
}
public class OverEx{
public static void main(String []args)
{
  Animal animal=new Animal();
animal.sound();
Dog dog=new Dog();
dog.sound();
dog.sound(100);
Animal dog2=new Dog();
dog2.sound();
}
}
