package Serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerilization {
    public static void main(String[] args) {
        File f= new File("C:\\JavaOpps\\FileHandling\\NewResourses\\demoSer.txt");
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;
        Demo d= new Demo(10, "Hello");
        try{
            fos=new FileOutputStream(f);
            oos= new ObjectOutputStream(fos);
            oos.writeObject(d);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
