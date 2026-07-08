package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class MethodClass {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\JavaOpps\\FileHandling\\Resourses\\pqr.txt", false);
            // ! all the methods of FileWriter throws  IOException 

            // ! 1. void write() methods->
            //* the writen type of the write() method will be void and take only String objects not stringbuffer or Stringbuilder objects */

            // ! write( char c)
            /*
             * Writes one character, not a number.
             * 65 → ASCII of 'A'
             * Writes single character
             */
            fw.write(65);
            fw.write('B');
            fw.write("\n");
            fw.write('G');
            fw.write(234556777);// it will be overflow of the unicode range but will be conveted in between the range;
            fw.flush();

            // ! write(char[] arr)
            // *Writes entire character array.
            char[] arr = { 'H', 'e', 'l', 'l', 'o' };

            fw.write(arr);
            fw.write("\n");
            fw.flush();
            // ! write(char[] cbuf, int off, int len)
            // * partial data writing */
            char[] arr1 = { 'J', 'A', 'V', 'A', 'S', 'C','R','I','P','T' };
            fw.write(arr1, 4, 6);
            fw.write("\n");

            // ! write(String str)
            // *For writing the entire string */
            fw.write("Hello World");
            fw.write("\n");
            fw.flush();

            // ! write(String str, int off, int len)
            // *Writing substrings without creating new String
            fw.write("Hello World", 5, 5);
            fw.write("\n");
            fw.flush();

            // ! 2. Writer append() methods
            // * the return type of the append() will be the same FileWriter() object so we can also do the channing and also it takes String buffer and builder also.
            // ! append(char c)
            // * Write an single charater
            fw.append('u');
            fw.append((char) 78);
            fw.append("et")
            .append("bye")
            .append("kaya hui")
            .append("hello");
            fw.append("\n");
            fw.flush();

            // ! append(CharSequence csq)
            // * CharSequeence type object means String , Stringbuffer, StringBuilder type
            // object.
            fw.append("bye bye");
            fw.flush();
            // ! append (charSequence csq, int start , int end)
            fw.append("abccd59", 2, 5);
             fw.append("\n");
            fw.flush();

            // ! 3. flush()
            // *Forces buffered data to be written to the file immediately
            // * Does NOT close the stream
            // * After flush(), you can still write
            fw.flush();

            // ! close()
            /*
             * Flushes remaining data
             * Releases OS resources
             * Closes the stream permanently
             */
           // fw.close();

        } catch (IOException e) {
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
