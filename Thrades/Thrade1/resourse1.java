package Thrade1;
public class resourse1 {
   
    public  void fun1() {
          Thread t =  Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(" "+i+" " + " Running thrade "+ t.getName());
        }
       
       
    }
   
}
