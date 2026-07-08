package PrintWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class assignment {
    public static void main(String[] args) {
        String p = "C:\\JavaOpps\\FileHandling\\NewResourses";//base path or parent
        File f = new File(p, "pqr.txt");
        FileWriter fw= null;
        PrintWriter pw= null;
       try{
           fw= new FileWriter(f);
           BufferedWriter bw = new BufferedWriter(fw);
           pw= new PrintWriter(bw, true);
           pw.print("hello world");
           pw.println();
           pw.println("we are writing in new line");

           pw.printf("Name : %s, Age : %d, CGPA: %.2f%n", "Ravi",23,7.789);
           pw.format("Name : %s, Age : %d, CGPA: %.2f%n", "Rohit",20,7.9);


       }catch(IOException e){
            e.printStackTrace();
       }finally{
        pw.close();
       }
        
    }
}
