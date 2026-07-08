package Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerilizable {
    public static void main(String[] args) {
        test t= new test(14, "Ravi", 333599855);
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;
        try{
            fos= new FileOutputStream("C:\\JavaOpps\\FileHandling\\Resourses\\test.txt");
            oos= new ObjectOutputStream(fos);
            oos.writeObject(t);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
