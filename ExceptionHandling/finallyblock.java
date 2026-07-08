public class finallyblock {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("try is executing");
        }
        catch (Exception e) {
        System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally always runs");
        }
    }

}
