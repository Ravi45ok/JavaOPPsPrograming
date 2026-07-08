public class thrade1 implements Runnable {
    resourse res;

    thrade1(resourse res) {
        this.res = res;
    }

    @Override
    public void run() {
        try {
            for (char i = 'A'; i <= 'E'; i++) {
                res.Capital(i);

                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
