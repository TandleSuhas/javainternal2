public class vehicle {
//defining a method
void run()
{
  System.out.println("Vehicle is running");
}
 void run(int number)
{
  System.out.println("Bike number is "+number);
}}
class Bike2 extends vehicle
{
void run()
{

  System.out.println("Bike is running safely");
}
 public static void main(String args[])
{
 Bike2 obj=new Bike2();
obj.run();
obj.run(9898);
}
}