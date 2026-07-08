package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class methods {
    public static void main(String[] args) {
        File f=null;
        FileReader ref=null;
        try{
             f= new File("C:\\JavaOpps\\FileHandling\\Resourses\\null.txt");
             ref= new FileReader(f);
            //! 1. int read() throws IOException
            //*Reads one character */
            int val= ref.read();
            while (val!=-1) {
                System.out.print((char)val);
                val= ref.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
