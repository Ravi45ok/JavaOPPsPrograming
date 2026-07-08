 interface A {
  public static final int x=10;
  int y=20;  //*  public static final
   void display(); //* abstract public void display();
   default void test(){
        System.out.println("Default keyword has no relationship with the visiblity");
        helperOfDefault();
   }
   public static void temp(){
        System.out.println("this belong to interface");
        helperOfStatic();
   }
   private void helperOfDefault(){
          System.out.println("Created as a helper method of default method test");
   }
   private static void helperOfStatic(){
          System.out.println("Created for the helper of the static method temp");
   }
   
}
interface B{
   int x=30;   // *public static final
   int z= 40;   //*  public static final
   void display(); 
   default void test(){
     System.out.println("default of B");
   }

}

public class demo implements A , B {
    @Override
    public void display() {
        System.out.println("we have implemented the abstract method of A and B");
    }
    @Override
    public void test() {
        System.out.println("implemetion is mendatory otherwise it will create the ambicutiy");
        A.super.test();
        B.super.test();
        
    }

    public void example(){
          System.out.println(A.x);// cannot call with demo.x because it will create Ambiqutiy
          System.out.println(demo.y);
    }
   // A.temp() not possible because static method is not inheritable



   public static void main(String[] args) {
      demo d= new demo();
      d.display();
      System.out.println();
   }

}
