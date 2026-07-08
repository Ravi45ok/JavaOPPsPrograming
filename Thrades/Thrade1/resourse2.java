package Thrade1;

public class resourse2 {
     public  void fun2(){
         Thread t =  Thread.currentThread();
        int sum=15;
        for(int i=0; i< 5; i++){
            sum+=i*5;
            System.out.println(" "+sum +" "+" Running thrade "+ t.getName());
        }

    }
}
