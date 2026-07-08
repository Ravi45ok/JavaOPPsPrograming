package FileClass;
import java.io.*;
import java.security.Security;
public class methods {
    public static void main(String[] args)   {
        String p="C:\\JavaOpps\\FileHandling\\Resourses"; // base path for File or folder  
        // ! 1. exists()
        //*  method signture->  boolean exists()
        //*  exists() checks whether a file or directory actually exists on the disk at the given path.
        //* does not throw any exception
        File f1= new File(p,"abc.txt");
        System.out.println(f1.exists());
        // //! 2. createNewFile()
        // * Method signture-> boolean (createNewFile() throws IOException
        //*  createNewFile() creates a new, empty file on the disk at the path represented by the File object.
        //*  The file size is 0 bytes
        //* it cratefile and return true when file does not exist at given path
        //* it does not create any file and return false if file already exist at given path 
        // ! when it can throw ioException->
        //* parent dirctroy does not exist.
        //* dirctory does not have a write permission
        //*Disk full
        //*Hardware I/O failure 
        //*File system corruption
        //*OS-level errors 
        //*Security manager restrictions 

        File f2= new File(p, "raju.txt");
        try {
            if(f2.exists()){
                System.out.println("file Already exist");
            }else{
                 f2.createNewFile();
                 System.out.println("file has been created");
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }



        // //! 3. delete()
        //* Method signature-> boolean delete()
        //* delete() removes the file or directory from the disk at the given path
        //* returns true if deletion is successful, false when the file does not exist at given path
        //* does not throw any exception
        File f3 = new File(p, "raju.txt");
        if(f3.delete()){
            System.out.println("file has been deleted");
        }else{
            System.out.println("file deletion failed");
        }

        // //! 4. isFile()
        // //* Method signature-> boolean isFile()
        // //* isFile() checks whether the path represents a file on the disk 
        // //* returns true if it is a file, false otherwise
        File f4 = new File(p, "gf.txt");
        System.out.println(f4.isFile());
        System.out.println(f4.exists());

        // //! 5. isDirectory()
        // //* Method signature-> boolean isDirectory()
        // //* isDirectory() checks whether the path represents a directory on the disk
        // //* returns true if it is a directory, false otherwise
        // File f5 = new File(p);
        // System.out.println(f5.isDirectory());

        // //! 6. length()
        // //* Method signature-> long length()
        // //* length() returns the number of charters in a file
        // //* returns 0 if path is a directory
        // File f6 = new File(p, "abc.txt");
        // System.out.println("File size: " + f6.length() + " bytes");

        // //! 7. list()
        // //* Method signature-> String[] list()
        // //* list() returns an array of strings containing filenames and directory names in the directory
        // //* returns null if the path is not a directory
        // File f7 = new File(p);
        // String[] files = f7.list();
        // if(files != null){
        //     for(String file : files){
        //     System.out.println(file);
        //     }
        // }

        // //! 7.listFiles()
        // //* Method signature-> List[] listFiles()
        // //*listFiles() returns an array of File objcts
        // //* returns null if the path is not a directory
        // File[] fileList = f7.listFiles();
        // System.out.println("program for files with .txt extention");
        // if(files != null){
        //     for(File file : fileList){
        //       if( file.isFile() && file.getName().endsWith(".txt"))
        //         System.out.println(file.getName());
        //     }
        // }
        System.out.println("these are the files with .txt extentionn");
        // //! 8. getName()
        // //* Method signature-> String getName()
        // //* getName() returns the name of the file or directory
        // File f8 = new File(p, "abc.txt");
        // System.out.println("Name: " + f8.getName());

        // //! 9. getAbsolutePath()
        // //* Method signature-> String getAbsolutePath()
        // //* getAbsolutePath() returns the absolute path of the file or directory
        // File f9 = new File(p, "abc.txt");
        // System.out.println("Absolute path: " + f9.getAbsolutePath());

        // //! 10. mkdir() and mkdirs()
        // //* Method signature-> boolean mkdir() and boolean mkdirs()
        // //* mkdir() creates a single directory, fails if parent doesn't exist
        // //* mkdirs() creates all parent directories as needed
        // File f10 = new File(p + "\\NewFolder");
        // if(f10.mkdir()){
        //     System.out.println("Directory created");
        // }else{
        //     System.out.println("Directory creation failed");
        // }
        // //! 11. canRead()
        // //* Method signature-> boolean canRead()
        // //* canRead() checks whether the application can read the file
        // File f11 = new File(p, "abc.txt");
        // try {
        //     f11.createNewFile();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Can read: " + f11.canRead());

        // //! 12. canWrite()
        // //* Method signature-> boolean canWrite()
        // //* canWrite() checks whether the application can write to the file
        // File f12 = new File(p, "abc.txt");
        // System.out.println("Can write: " + f12.canWrite());

        // //! 13. canExecute()
        // //* Method signature-> boolean canExecute()
        // //* canExecute() checks whether the application can execute the file
        // File f13 = new File(p, "abc.txt");
        // System.out.println("Can execute: " + f13.canExecute());

        // //! 14. setReadable()
        // //* Method signature-> boolean setReadable(boolean readable)
        // //* setReadable() sets read permission for the file
        // File f14 = new File(p, "abc.txt");
        // f14.setReadable(true);

        // //! 15. setWritable()
        // //* Method signature-> boolean setWritable(boolean writable)
        // //* setWritable() sets write permission for the file
        // File f15 = new File(p, "abc.txt");
        // f15.setWritable(true);

        // //! 16. setExecutable()
        // //* Method signature-> boolean setExecutable(boolean executable)
        // //* setExecutable() sets execute permission for the file
        // File f16 = new File(p, "abc.txt");
        // f16.setExecutable(true);

        // //! 17. lastModified()
        // //* Method signature-> long lastModified()
        // //* lastModified() returns the time when the file was last modified in milliseconds
        // File f17 = new File(p, "abc.txt");
        // System.out.println("Last modified: " + f17.lastModified());

        // //! 18. renameTo()
        // //* Method signature-> boolean renameTo(File dest)
        // //* renameTo() renames the file to the specified destination
        // File f18 = new File(p, "abc.txt");
        // File newFile = new File(p, "xyz.txt");
        // if(f18.renameTo(newFile)){
        //     System.out.println("File renamed successfully");
        // }else{
        //     System.out.println("File rename failed");
        // }
    }
}
