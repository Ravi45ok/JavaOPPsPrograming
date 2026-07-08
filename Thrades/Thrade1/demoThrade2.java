package Thrade1;

public class demoThrade2 implements Runnable {
    resourse1 res1;
    resourse2 res2;

    demoThrade2(resourse1 res1, resourse2 res2) {
        this.res1 = res1;
        this.res2 = res2;
    }

    @Override
    public void run() {
        // synchronized(res2){
        //         res2.fun2();
        //     }
        synchronized (res1) {
             res1.fun1();
            }
        }
    }

