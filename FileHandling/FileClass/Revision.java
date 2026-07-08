package FileClass;

import java.io.File;
import java.io.IOException;

public class Revision {
    public static void main(String[] args) {
      
        String Path="C:\\JavaOpps\\FileHandling\\NewResourses";

        File f = new File("NewResourses\\File");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file has been created");
        File f1= new File(Path,"xyz.txt");
    }
}
