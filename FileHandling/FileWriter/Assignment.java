package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment {
    public static void main(String[] args) {
        String p = "C:\\JavaOpps\\FileHandling\\NewResourses";//base path or parent

        File f= new File(p, "abc.txt");
        FileWriter fw= null;
        try{
             fw=new FileWriter(f);
             fw.write('A');
             fw.write(" ");
             fw.write("tiger");
             fw.flush();
             fw.append("used to live ")
             .append("his life happliy ")
             .append("but now a days he is not happy")
             .append("\n")
             .append("what worng can happen with him");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
