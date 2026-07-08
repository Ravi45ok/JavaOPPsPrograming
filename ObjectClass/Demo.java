class A {

    
}

public class Demo extends A{
    int a=10;
    int b=20;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object");
    }

    public static void main(String[] args) {

        A d1 = new Demo();
        Demo d2 = new Demo();
         System.out.println(d1.getClass());

        // Making objects eligible for garbage collection
        d1 = null;
        d2 = null;

        // Requesting garbage collection
        System.gc();
       

        System.out.println("End of main method");
    }
}
