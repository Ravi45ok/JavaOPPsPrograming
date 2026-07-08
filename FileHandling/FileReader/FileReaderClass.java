package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String[] args) {
        // ! contructors->
        /*
         * File must exist
         * If file does NOT exist → ❌ FileNotFoundException
         * FileReader does NOT create files
         */
        //! 1. FileReader(Filename/path)
        FileReader ref1=null;
        try {
             ref1= new FileReader("C:\\JavaOpps\\FileHandling\\Resourses\\null.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // ! FileReader(File file)
        File f= new File("C:\\JavaOpps\\FileHandling\\Resourses\\null.txt");
        try{
            FileReader ref2 = new FileReader(f);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}