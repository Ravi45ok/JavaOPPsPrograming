import java.io.FileNotFoundException;
import java.io.FileReader;

public class Student {
    static int x;
     int  y;
    static{
        System.out.println("This is static block 1");
        
    }
     static{
        System.out.println("This is static block 2");
    }
    {
        System.out.println("this is non static block");
          FileReader fr = new FileReader("abc.txt");
    }

    Student() throws FileNotFoundException{
        this.y=10;
      
    }
    Student(int y) throws FileNotFoundException{
         this.y=y;
    }
    public static void main(String[] args) {
        
    }
}
