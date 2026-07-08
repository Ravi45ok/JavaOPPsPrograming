class A{
    int x=10; 
    static int y=20;
    public static void fun(){
        System.out.println("Static method of class A");
    }
    public void run(){
        System.out.println("non-static method of class A");
    }

}
class B extends A{
    int x=30; 
    static int y=40;
    public static void fun(){
        System.out.println("Static method of class B");
    }
    public void run(){
        System.out.println("non-static method of class B");
    }
    public void xyz(){
        fun();
        run();
        super.fun();
        super.run();
    }

}
public class HidingConcept {
    public static void main(String[] args) {
        B b= new B();
       System.out.println(b.x);
       System.out.println(b.y);
        b.run();
        A a= new B();
        a.run();
       System.out.println(a.x); 
      System.out.println(a.y);
    }
}
//! Method Area – Class A
// Class A metadata
//  ├── method bytecode:
//  │     ├── fun()   (static)
//  │     └── run()   (non-static)
//  ├── static variable:
//  │     └── y = 20
//  ├── field info:
//  │     └── x (instance variable metadata)
//  ├── constant pool
//  └── class info (name, modifiers, etc.)


//! Method Area – Class B (separate entry)
// Class B metadata
//  ├── method bytecode:
//  │     ├── fun()   (static – hides A.fun)
//  │     └── run()   (non-static – overrides A.run)
//  ├── static variable:
//  │     └── y = 40
//  ├── field info:
//  │     └── x (instance variable metadata)
//  ├── reference to superclass → Class A
//  └── constant pool

