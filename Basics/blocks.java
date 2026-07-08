package Basics;

public class blocks {
    int a = 10;
    int b = 20;
    {
        System.out.println(a + b);
        System.out.println("I am non static block 1");

    }
    {
        System.out.println("I am non static block 2");
    }

    static {
        // System.out.println(a+b); // this will give error because static block cannot
        // access non static variables directly
        System.out.println("I am static block 1");
    }
    static {
        System.out.println("I am static block 2");
    }

    // final {
    // System.out.println("I am final block");
    // }
    public static void main(String[] args) {
        System.out.println("I am main function");
        blocks obj = new blocks();
        blocks obj2 = new blocks();
    }
}
