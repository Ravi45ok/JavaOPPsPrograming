package Synchrozation;

public class Thrade1 extends Thread{

    resourse res;
    Thrade1(resourse res){
        this.res=res;
    }
    public void run() {
        res.demo();
        res.display();
    }

}
