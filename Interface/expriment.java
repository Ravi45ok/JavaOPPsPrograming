public class expriment {
   final  int  x=10;
    static void fun(){
        System.out.println("static method of interface");
    }

}
 class test extends expriment {
      int x=20;
     static void fun(){
        System.out.println("static method of subclass");
     }
}