public class resourse {
    boolean small = true;

    synchronized void Capital(char i) throws InterruptedException {
        while (!small) {
            wait();
        }
        System.out.println(i);
        small = false;
        notify();
    }

    synchronized void small(char i) throws InterruptedException {
        while (small) {
            wait();
        }
        System.out.println(i);
        small = true;
        notify();

    }
}
