package Thrade2;

class SharedData {
    int data;
    boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
     // notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait();
        }
        System.out.println("Consumed: " + data);
        hasData = false;
     // notify();
    }
}

