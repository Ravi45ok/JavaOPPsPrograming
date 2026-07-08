class A{}
class B extends A{}
public class Ambiguity {
    // ! Compiler sees multiple overloaded methods and cannot decide which one to call.

    void show(int a, float b) {
        System.out.println("int-float");
    }

    void show(float a, int b) {
        System.out.println("float-int");
    }
    void show(B b) {
        System.out.println("B object");
    }
    void show(A a) {
        System.out.println("A object");
    }

    


    public static void main(String[] args) {
        Ambiguity t = new Ambiguity();
       // t.show(10, 10);   // ❌ ambiguity
        //*  We have manually tell them the data type to  remove ambiguity.
        t.show((int)10,(float)10); // now there is nowe ambiquity.
        B b= new B();
        t.show(b);


        //*“At compile time, Java resolves only the method signature using the reference type to ensure type safety. Runtime polymorphism applies only to the implementation of that selected signature, and Java guarantees that subclasses can only override—not alter—the signature, making this separation safe.”
        
           */
        
    }
}
