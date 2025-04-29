class OrderProcessing extends Thread {
    private static int orderCount = 0;

    public synchronized void processOrder() {
        orderCount++;
        System.out.println(Thread.currentThread().getName() + " processed order: " + orderCount);
    }

    @Override
    public void run() {
        processOrder();
    }
}

public class MultiThreadOrder {
    public static void main(String[] args) {
        OrderProcessing op = new OrderProcessing();
        Thread t1 = new Thread(op, "Thread-1");
        Thread t2 = new Thread(op, "Thread-2");
        t1.start();
        t2.start();
    }
}
