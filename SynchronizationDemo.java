class Counter {
private int count = 0;
public synchronized void increment() {
count++;
}
public synchronized int getCount() {
return count;
}
}
class IncrementThread extends Thread {
private Counter counter;
public IncrementThread(Counter counter) {
this.counter = counter;
}
public void run() {
for (int i = 0; i < 10000; i++) {
counter.increment();
}
}
}
public class SynchronizationDemo {
public static void main(String[] args) throws InterruptedException {
Counter counter = new Counter();
IncrementThread thread1 = new IncrementThread(counter);
IncrementThread thread2 = new IncrementThread(counter);
thread1.start();
thread2.start();
thread1.join();
thread2.join();
System.out.println("Final count: " + counter.getCount());
}
}