package Synchrozation;

public class resourse {
   
    synchronized void display() {
        System.out.println("display method is synchronized"+ Thread.currentThread().getName());
        
    }
    synchronized void test(){
        System.err.println("test method is synchronized"+ Thread.currentThread().getName());
    }
     void demo() {
        System.out.println("this is a normal method for" + Thread.currentThread().getName());
    }

}
