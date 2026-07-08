public class Thread2 extends Thread {
    Shared sd;

    Thread2(Shared sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (sd) {
                if (!sd.state) {
                    System.out.println("T2: nahi, tum jao pehle");
                    sd.state = true; // T1 ko chance
                }
            }

        }
    }
}
