package WaitandNotify;

public class resourse {

    synchronized void display() {
        System.out.println("display method is synchronized" + Thread.currentThread().getName());
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void fun() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Running in thread " + Thread.currentThread().getName());
        }

    }
}
