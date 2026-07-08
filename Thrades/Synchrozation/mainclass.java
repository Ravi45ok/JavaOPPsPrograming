package Synchrozation;

public class mainclass {
    public static void main(String[] args) {
        resourse res= new resourse();
        Thrade1 th1= new Thrade1(res);
        Threde2 th2= new Threde2(res);
        th1.start();
        th2.start();
    }
}
