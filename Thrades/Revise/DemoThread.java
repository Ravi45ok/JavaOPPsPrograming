package Revise;

public class DemoThread extends Thread {
    // public void start() {
    //     System.out.println("not a final mehtod we can alter the code");
    // }
    @Override
    public void run() {
        System.out.println("run will execute");
    }
}
