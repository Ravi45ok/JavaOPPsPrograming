import java.io.FileReader;
import java.io.IOException;

public class throwsProgram {
     static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("program is executed");
    }
   
}
