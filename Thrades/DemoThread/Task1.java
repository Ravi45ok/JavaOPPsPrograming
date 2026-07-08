package DemoThread;

public class Task1 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 4; i++)
            System.out.println("Task2 is being executed");

    }
}
