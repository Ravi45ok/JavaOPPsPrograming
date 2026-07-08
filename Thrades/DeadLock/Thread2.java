package DeadLock;

public class Thread2 extends Thread{

    resourese1 lock1;
     resourese2 lock2;

    Thread2(resourese1 lock1, resourese2 lock2 ){
        this.lock1= lock1;
        this.lock2=lock2;
    }
    @Override
    public void run() {
        synchronized(lock2){
             System.out.println("Thread two has been started by aquring lock2");

             try {
                Thread.sleep(100);//*  This is recommended So that Thread2 might not get both locks immdetily, sleep give a chance to  other thread to aquire the lock. without sleep it might also work.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(lock1){
                System.out.println("lock1 is requried, then only lock2 will be free");
            }
        }
    }
}