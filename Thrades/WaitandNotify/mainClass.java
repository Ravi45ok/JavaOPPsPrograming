package WaitandNotify;

public class mainClass {
    
    public static void main(String[] args) {
        resourse res= new resourse();
        Thread1 th1= new Thread1(res);
        Thread3 th3= new Thread3(res);
        Thread2 th2= new Thread2(res, th1, th3);
        th1.start();
        th2.start();
        th3.start();
        th1.setName("frist");
        th2.setName("second");
        th3.setName("third");
       th1.interrupt();
       th3.interrupt();
    }
}
