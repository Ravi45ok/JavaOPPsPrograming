class x {

    int a=10;
    static int b=20;
    static void fun(){
        System.out.println("static fun of super class");
    }
    void display(){
        System.out.println("disp of super class");
    }

}
class y extends x{
    int a=50;
     int b=30;

    static void fun(){
          System.out.println("static method of subclass");
     }
     void display(){
        System.out.println("disp of sub class");
    }
}

public class Up_DownCasting {
    public static void main(String[] args) {
       x obj= new y(); // upcasting
        System.out.println( obj instanceof y);

       y obj1= (y)obj;// downcasting
       System.out.println(obj1 instanceof x);
       obj.fun();
       obj.display();
       System.out.println(obj.b);
       

        obj1.fun();
       obj1.display();
       System.out.println(obj1.b);


    }
}
