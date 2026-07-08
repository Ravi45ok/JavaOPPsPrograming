package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
    public static void main(String[] args) {
        String p = "C:\\JavaOpps\\FileHandling\\NewResourses";//base path or parent
        File f = new File(p, "pqr.txt");
        FileReader fr= null;
        try{
            fr= new FileReader(f);
            int value= fr.read();

            while (value !=-1) {
                System.out.print((char)value);
                value= fr.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
