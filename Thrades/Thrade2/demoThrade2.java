package Thrade2;

public class demoThrade2 implements Runnable{
    SharedData sd;
    demoThrade2(SharedData sd){
         this.sd=sd;
    }
    @Override
    public void run() {
         try {
                for (int i = 1; i <= 5; i++) {
                    sd.consume();
                   Thread.sleep(500);
                }
            } catch (Exception e) {}
    }
}
