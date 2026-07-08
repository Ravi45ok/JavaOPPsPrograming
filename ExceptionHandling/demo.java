public class demo {
    public static void main(String[] args) {
        try{
            int a= 1/0;
        }
        finally{
            System.out.println("finally block always runs");
        }
    }
}
