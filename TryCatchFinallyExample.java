import java.util.Scanner;
public class TryCatchFinallyExample {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 try {
 System.out.print("Enter a number: ");
 int num = scanner.nextInt();
 int result = 10 / num;
 System.out.println("Result: " + result);
 } catch (ArithmeticException e) {
 System.out.println("Error: Division by zero!");
 } catch (Exception e) {
 System.out.println("Error: " + e.getMessage());
 } finally {
 scanner.close();
 System.out.println("Scanner closed in the finally block.");
 }
 System.out.println("Program continues after try-catch-finally.");
 }
}