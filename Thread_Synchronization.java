class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ": Count is " + count);
            try {
                Thread.sleep(100); // Simulate some work being done
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads sharing the same Counter instance
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}