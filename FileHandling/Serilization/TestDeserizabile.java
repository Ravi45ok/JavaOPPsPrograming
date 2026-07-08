package Serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserizabile {
    public static void main(String[] args) {
        FileInputStream fis= null;
        ObjectInputStream ois=null;
        try{
            fis= new FileInputStream("C:\\JavaOpps\\FileHandling\\Resourses\\test.txt");
            ois=new ObjectInputStream(fis);
            test t= (test)ois.readObject();
            t.display();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();
                ois.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }

    }
}
