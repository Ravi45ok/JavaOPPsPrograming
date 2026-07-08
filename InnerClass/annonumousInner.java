 interface  xyz {
    void fun1();
    void fun2(); 
}
public class annonumousInner{
   static int  x=10;
    public static void main(String[] args) {
        int y=20;
        xyz obj= new xyz() {
            int x=10;
            static int y=30;
            @Override
            public void fun1() {
                System.out.println("implemtion of  fun1");
                System.out.println(x);
            }
            @Override
            public void fun2() {
                System.out.println("implemtion of fun");
                 System.out.println(y);
            }
        };
        obj.fun1();
        obj.fun2();

    }
}