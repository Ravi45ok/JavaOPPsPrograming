package BufferWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Assignment {
   public static void main(String[] args) {
     String p = "C:\\JavaOpps\\FileHandling\\NewResourses";//base path or parent
    File f = new File(p, "xyz.txt");
    FileWriter fw=   null;
    BufferedWriter bw = null;
   

    try{
        fw= new FileWriter(f);
         bw= new BufferedWriter(fw);

         bw.write("Hello world");
         bw.newLine();
         bw.append("Hello ji");
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   }

}
