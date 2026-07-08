package Thrade1;

public class mainclass1 {
   public static void main(String[] args) {
    resourse1 res1 = new resourse1();
    resourse2 res2 = new resourse2();
     demoThrade1 d1= new demoThrade1(res1, res2);
     demoThrade2 d2 = new demoThrade2(res1,res2);
    Thread th1= new Thread(d1);
    Thread th2 = new Thread(d2);
    th1.setName("thrade1");
    th2.setName("thrade2");
    th1.start();
    th2.start();
   }

}
