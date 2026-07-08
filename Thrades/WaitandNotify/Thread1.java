package WaitandNotify;

public class Thread1 extends Thread {
    resourse res;
   
    Thread1(resourse res) {
        this.res = res;
    }
  
    public void run() {
        synchronized (res) {
            res.fun();
            // System.out.println(isInterrupted());
            try {
                res.wait();
            } catch (InterruptedException e) {

                System.out.println("intrrupt exception in " + Thread.currentThread().getName());
            }
           // System.out.println(isInterrupted());
            System.out.println(Thread.currentThread().getName() + " is completly executed");
        }
    }
}
