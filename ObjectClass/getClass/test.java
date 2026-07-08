public class test {
    public static void main(String[] args) {
        test t= new test();
       Class<?> s= t.getClass();
       System.out.println(s);// it will call toString method
       System.out.println( s.getName());
    }
}
