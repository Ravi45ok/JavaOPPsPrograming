package Serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserilization {
    public static void main(String[] args) {
         File f= new File("C:\\JavaOpps\\FileHandling\\NewResourses\\demoSer.txt");
        FileInputStream fis=null;
        ObjectInputStream ois= null;
        Demo d= null;

        try{
              fis = new FileInputStream(f);
              ois=new ObjectInputStream(fis);
             d=  (Demo)ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
           try {
            ois.close();
           } catch (IOException e) {
            e.printStackTrace();
           }
        }
        d.display();
    }
}
