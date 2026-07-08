public class demo {
    public static void main(String[] args) {

        Student s1=null;
        s1.hashCode();
       
        try {
            Class.forName("Student");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main of demo has been executed");
    }
}
