class PriorityThread extends Thread {
public PriorityThread(String name) {
super(name);
}
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(getName() + ": " + i);
try {
Thread.sleep(500); // Sleep for 0.5 seconds
} catch (InterruptedException e) {
System.out.println(getName() + " interrupted.");
}
}
}
}
public class ThreadPriorityDemo {
public static void main(String[] args) {
PriorityThread highPriorityThread = new PriorityThread("High Priority");
PriorityThread normalPriorityThread = new PriorityThread("Normal Priority");
PriorityThread lowPriorityThread = new PriorityThread("Low Priority");
highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Set highest priority (10)
normalPriorityThread.setPriority(Thread.NORM_PRIORITY); // Set default priority (5)
lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Set lowest priority (1)
highPriorityThread.start();
normalPriorityThread.start();
lowPriorityThread.start();
}
}