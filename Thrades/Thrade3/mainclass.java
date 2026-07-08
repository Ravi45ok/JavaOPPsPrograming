public class mainclass {
    public static void main(String[] args) {

        resourse res = new resourse();
        thrade1 th1 = new thrade1(res);
        thrade2 th2 = new thrade2(res);
        thrade3 th3 = new thrade3();
        Thread Th1 = new Thread(th1);
        Thread Th2 = new Thread(th2);
        Thread Th3 = new Thread(th3);
        Th1.start();
        Th2.start();
        Th3.start();
        try{ Thread.sleep(10000);}
        catch(InterruptedException e){
        e.printStackTrace();
        }
        Th3.interrupt();
    }
}