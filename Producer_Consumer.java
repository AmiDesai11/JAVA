import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
    private final ArrayBlockingQueue<Integer> buffer;

    public Producer(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Producing " + i);
                buffer.put(i);
                Thread.sleep(1000); // Simulate some work being done
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final ArrayBlockingQueue<Integer> buffer;

    public Consumer(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = buffer.take();
                System.out.println("Consuming " + value);
                Thread.sleep(1500); // Simulate some work being done
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Producer_Consumer {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}