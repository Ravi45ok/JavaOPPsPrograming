
class outer {
    int x = 10;
    static int y = 20;

    static class inner {
        int z=30;
        void display() {
            System.out.println(y);
        }
    }
}

public class staticInner {
    public static void main(String[] args) {
        outer.inner in = new outer.inner();
        System.out.println(in.z);
        in.display();
    }
}
