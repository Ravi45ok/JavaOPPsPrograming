package Synchrozation;

public class Threde2 extends Thread {

    resourse res;

    Threde2(resourse res) {
        this.res = res;
    }

    public void run() {
        res.demo();
        res.display();
    }
}
