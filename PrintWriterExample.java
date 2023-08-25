import java.io.*;
public class PrintWriterExample {
public static void main(String[] args) {
try {
// Create a PrintWriter object for writing to a file
PrintWriter writer = new PrintWriter("output.txt");
// Write formatted text data to the file
writer.println("Hello, PrintWriter!");
writer.println("This is a demonstration of PrintWriter class.");
writer.printf("Formatted Number: %d%n", 42);
// Close the PrintWriter
writer.close();
System.out.println("Data written to output.txt");
// Read and display the contents of the written file
BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
String line;
System.out.println("\nContents of output.txt:");
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
reader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}