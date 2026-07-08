package Thrade2;

public class demoThrade1 implements Runnable{
    SharedData sd;
    demoThrade1(SharedData sd){
         this.sd=sd;
    }
    @Override
    public void run() {
         try {
                for (int i = 1; i <= 5; i++) {
                    sd.produce(i);
                  Thread.sleep(500);
                }
            } catch (Exception e) {}
        
    }
}
