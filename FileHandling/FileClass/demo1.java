package FileClass;
import java.io.*; 
public class demo1 {
     public static void main(String[] args) {
        String path="C:\\JavaOpps\\FileHandling\\Resourses";
       File ref= new File(path);
       String[] list= ref.list();
       //! all files and folders
       for(String item : list){
           System.out.print(item+"  ");
       }
       System.out.println();
       // ! No of files
       int count=0;
        for(String item : list){
           File obj= new File(path, item);
           if(obj.isFile()) count++;
       }
       System.out.println(count);
       // ! No of folders
       count=0;
        for(String item : list){
           File obj= new File(path, item);
           if(obj.isDirectory()) count++;
       }
       System.out.println(count);

     }
}
