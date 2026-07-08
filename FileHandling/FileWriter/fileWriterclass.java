package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fileWriterclass {
    public static void main(String[] args) {

        // ! Consturctors of FileWriter->
        // ! 1. FileWriter(String fileName/path)
        // * Creates file if it does not exist
        // * Overwrites file if it exists, overwrite means content inside the file will be cleared and it will act as new file
        // * Opens file in write mode
        // * we use it when we don't want to append the existing file or wants to crate a new file which does not exist.
        try {
            FileWriter Fw1 = new FileWriter("C:\\JavaOpps\\FileHandling\\Resourses\\pqr.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // !2. FileWriter(String fileName/path, boolean append)
        // *append = true → adds data at the end even though if file is already exist it will not overwrite it.
        // *append = false → overwrite.

        try {
            FileWriter fw2 = new FileWriter("C:\\JavaOpps\\FileHandling\\Resourses\\null.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ! 3. FileWriter(File file)
        //* it take a file type object as arugument 
        // * rest bheaviors are same as frist constructor
        File file= new File("C:\\JavaOpps\\FileHandling\\Resourses\\amk.txt");
        try  {
            FileWriter fw3 = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ! 4. FileWriter(File file, boolean append)
        //* it take a file type object and boolean append as arugument 
        // * rest bheaviors are same as second constructor
         file= new File("C:\\JavaOpps\\FileHandling\\Resourses\\amk.txt");
        try  {
            FileWriter fw3 = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
