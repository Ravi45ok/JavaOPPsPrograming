package DeadLock;

public class mainclass {

    public static void main(String[] args) {
        resourese1 lock1 = new resourese1();
        resourese2 lock2 = new resourese2();
        Thread1 th1 = new Thread1(lock1, lock2);
        Thread2 th2 = new Thread2(lock1, lock2);
        th1.start();
        th2.start();

    }
}
