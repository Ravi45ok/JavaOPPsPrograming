package BufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriterClass {
    public static void main(String[] args) {
        // ! Constructor->
        // * BufferedWriter Constructor take fileWriter obj as a arugumet 
        FileWriter fw = null;
        BufferedWriter ref = null;
        try {
            fw = new FileWriter("C:\\JavaOpps\\FileHandling\\Resourses\\abc.txt", false);
            ref = new BufferedWriter(fw);
            ref.write("JavaScript");
            //! Methods of Bufferwriter ->
            //* Bufferwrite does not add many extra methods , it  add one method called newLine() which is plateform independet*/
            // ! newLine()
            ref.newLine();
            ref.append("is Very good programing langauge");
            ref.newLine();
            ref.write("------------------------------------");
            ref.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
