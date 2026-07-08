public class thrade3 implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Ravi is learning Thrades");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread3 has been intrrupted");
        }
        
    }
    
}
