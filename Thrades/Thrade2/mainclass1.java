package Thrade2;

public class mainclass1 {
    public static void main(String[] args) {
        SharedData sd = new SharedData();
         demoThrade1 d1= new demoThrade1(sd);
         demoThrade2 d2= new demoThrade2(sd);
        Thread producer = new Thread(d1);
        Thread consumer = new Thread(d2);
        producer.start();
        consumer.start();
    }
}

