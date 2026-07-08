package DeadLock;

public class Thread1 extends Thread {
     resourese1 lock1;
     resourese2 lock2;

    Thread1(resourese1 lock1, resourese2 lock2 ){
        this.lock1= lock1;
        this.lock2=lock2;
    }
    @Override
    public void run() {
        synchronized(lock1){
             System.out.println("Thread one has been started by aquring lock1");

             try {
                Thread.sleep(100); //*  This is recommended So that Thread1 might not get both locks immdetily, sleep give a chance to  other thread to aquire the lock. without sleep it might also work.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(lock2){
                System.out.println("lock2 is requried, then only lock1 will be free");
            }
        }
    }
}
