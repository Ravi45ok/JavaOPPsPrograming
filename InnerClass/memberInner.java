class outer {
    int x;
    int y;
    static int p =50;

    outer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    class inner {
        int x;
        int z;
        static int y = 20;
        static final int w = 10;


        inner(int x, int z) {
            this.x = x;
            this.z = z;
        }

        void display() {
            System.out.println("value of x is " + this.x);
            System.out.println("value of x is " + x);
            System.out.println("value of y is " + this.z);
            System.out.println("value of  p is "+ p);
        }
    }

    void display() {
        System.out.println("value of x is " + this.x);
        System.out.println("value of y is " + this.y);
        System.out.println("value of  p is "+ p);

    }
}

public class memberInner {
    public static void main(String[] args) {
        outer out= new outer(10, 20 );
        outer.inner in= out.new inner(30, 40);
        out.display();
        in.display();
    }
}