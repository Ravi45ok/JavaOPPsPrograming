public class thrade2 implements Runnable {
    resourse res;

    thrade2(resourse res) {
        this.res = res;
    }

    @Override
    public void run() {
        try {
            for (char i = 97; i <= 101; i++) {
                res.small(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
