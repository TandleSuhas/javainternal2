public class ExceptionDemo1 {
public static void main(String[] args) {
try {
int[] numbers = { 1, 2, 3 };
try {
System.out.println("Accessing element at index 5: " + numbers[5]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Inner catch block: ArrayIndexOutOfBoundsException");
}
int result = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Outer catch block: ArithmeticException");
} catch (Exception e) {
System.out.println("Outer catch block: Generic Exception");
} finally {
System.out.println("Finally block executed");
}
}
}