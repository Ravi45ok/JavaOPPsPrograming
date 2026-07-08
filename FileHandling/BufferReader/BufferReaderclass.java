package BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderclass {
    public static void main(String[] args) {
        // ! Constructor-> BufferedReader(new FileReader())
        FileReader fr = null;
        BufferedReader ref = null;
        try {
            fr = new FileReader("C:\\JavaOpps\\FileHandling\\NewResourses\\pqr.txt");
            ref = new BufferedReader(fr);
            // ! methods->
            // ! 1. read()
            // * read will also work here
            // ! 2. readline()
            /*
             * Reads one full line
             * Stops at: \n or \r\n as soon as got the newline
             * Returns:  line as String
             * null → end of file
             */
            String line= ref.readLine();
            while (line != null) {
                System.out.println(line);
                line=ref.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //*closeing outmost resouese will close() all inner resoruses */
            try {
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
