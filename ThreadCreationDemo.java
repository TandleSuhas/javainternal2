class MyThread extends Thread {
public void run() {
for (int i = 1; i <= 5; i++) {
System.out.println("Thread: " + i);
try {
Thread.sleep(1000); // Sleep for 1 second
} catch (InterruptedException e) {
System.out.println("Thread interrupted.");
}
}
}
}
public class ThreadCreationDemo {
public static void main(String[] args) {
MyThread thread = new MyThread();
thread.start(); // Start the thread
for (int i = 1; i <= 5; i++) {
System.out.println("Main: " + i);
try {
Thread.sleep(500); // Sleep for 0.5 seconds
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
}
}
}