package FileClass;
import java.io.File;
import java.io.IOException;
public class FileClass {
    public static void main(String[] args) {
        // !1. with the help of java same name file and foler cannot be created at same location , for example if file name X has been created then folder X cannot be created, i mean for same File object you cannot call both createNewFile() and mkdir(). frist one will be true and second one will be false.

        // ! 2. java does not care about extention a path which have extention at the end we can create foler of it also a name which don't have extention we can create a file of it as well.
        
        // ! 3. remember if you don't pass absolute path all the operations will be excututed on current working directory file or foldr which means if it not strting form C:\\ it is relative path and it will considered with respect to current woking directory.



        // ! constructors of File Class
             //! 1. new File(String Relavetive path)
             // *Relative path
            //  *Current working directory me check karega
            File f= new File("test.txt");//*  it will not create any file or folder it is just a reference to path of file or directory. even though you pass the worong path it will not give any exception because it is just a java object it will not hit the disk until we call createNewFile() or Mkdir().
            File f1= new File("test1.txt");
            try {
               System.out.println("File has been created -> "+ f.createNewFile());//* it will create the file  in which directory where the program is executing 
               System.out.println("Folder has been created ->" +f1.mkdir());//* it will create the folder  in which directory where the program is executing 
            } catch (IOException e) {
                e.printStackTrace();
            }
            f= new File("Resourses1");
            f1=new File("Resourses");
            try {
                System.out.println("File has been created -> "+ f.createNewFile());;
                System.out.println("Folder has been created ->" +f1.mkdir());
            } catch (IOException e) {
                e.printStackTrace();
            }

            //!2. new File(String aboslute path)
        f= new File("C:\\JavaOpps\\FileHandling\\Resourses\\resourses1");
        System.out.println(f.mkdir());
        f= new File("C:\\JavaOpps\\FileHandling\\Resourses\\resourses.txt");
         try {
            System.out.println(f.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ! 3. new File(String path, String file/folder name)

        f= new File("C:\\JavaOpps\\\\FileHandling\\\\Resourses", "resourses2");
        System.out.println(f.mkdir());
        f= new File("C:\\JavaOpps\\\\FileHandling\\\\Resourses", "resourses2.txt");
        try {
            System.out.println(f.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
