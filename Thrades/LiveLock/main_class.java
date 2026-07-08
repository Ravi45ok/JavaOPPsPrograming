public class main_class{
    public static void main(String[] args) {
        Shared sd = new Shared();
        Thread1 t1 = new Thread1(sd);
        Thread2 t2 = new Thread2(sd);
        t1.start();
        t2.start();
        
    }
}
