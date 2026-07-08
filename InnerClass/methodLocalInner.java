class outer {
    int x = 10;

    void demo(int value) {
        System.out.println("excution demo started");
        class inner {
            int y; // implyctily final becuase it is a local variable present in stack memory and object of inner will be crated in heap memory so jvm usease the one copy of that variable so when stack is deleted object is still exist. 

            inner(int y) {
                this.y = y;
            }

            void helperMethods() {
                System.out.println("helper class for demo method");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                
            }
        }
        inner in = new inner(value);
        in.helperMethods();
        System.out.println("execution demo has been end");
    }
}

public class methodLocalInner {
    public static void main(String[] args) {
        outer out = new outer();
        out.demo(20);
    }
}
