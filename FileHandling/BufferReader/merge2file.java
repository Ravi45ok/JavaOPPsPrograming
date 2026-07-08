package BufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class merge2file {
    public static void main(String[] args) {
        File file1 = new File("C:\\JavaOpps\\FileHandling\\Resourses\\abc.txt");
        File file2 = new File("C:\\JavaOpps\\FileHandling\\Resourses\\null.txt");
        File merge = new File("C:\\JavaOpps\\FileHandling\\Resourses\\merge.txt");
        BufferedReader ref1=null;
        BufferedReader ref2=null;
        PrintWriter ref=null;
        try{
            ref1 = new BufferedReader(new FileReader(file1));
            ref2 = new BufferedReader(new FileReader(file2));
            ref=   new PrintWriter(new BufferedWriter(new FileWriter(merge)), true);
            String line=ref1.readLine();
            while( line !=null){
                ref.println(line);
              line=  ref1.readLine();
            }

            line= ref2.readLine();
            while (line !=null) {
                ref.println(line);
               line= ref2.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                ref.close();
                ref1.close();
                ref2.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
