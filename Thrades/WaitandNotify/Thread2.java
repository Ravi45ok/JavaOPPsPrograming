package WaitandNotify;

public class Thread2 extends Thread {
    resourse res;
    Thread1 th1;
    Thread3 th3;

    Thread2(resourse res, Thread1 th1,Thread3 th3) {
        this.res = res;
        this.th1= th1;
        this.th3= th3;
    }

    public void run() {
        synchronized (res) {
            res.fun();
            // try {
            //     res.wait();
            // } catch (InterruptedException e) {

            //     System.out.println("intrrupt exception in " + Thread.currentThread().getName());
            // }
            res.notifyAll();
            
            System.out.println(Thread.currentThread().getName() + " is completly executed");
        }
    }
    
}
