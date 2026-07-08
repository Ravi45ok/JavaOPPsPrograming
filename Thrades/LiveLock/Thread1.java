public class Thread1 extends Thread {
    Shared sd;

    Thread1(Shared sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sd) {
                if (sd.state) {
                    System.out.println("T1: tum jao pehle");
                    sd.state = false; // T2 ko chance
                }
            }

        }
    }
}
