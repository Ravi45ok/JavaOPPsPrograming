package PrintWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterClass {
   public static void main(String[] args) {
      // ! Constructors ->
      // ! 1. PrintWriter(String fileName)
      /*
       * Creates the file if it does not exist
       * Overwrites the file if it exists
       * Uses default character encoding
       * No buffering unless OS-level
       * FileNotFoundException does NOT mean “file does not exist”.
       *It means “file could not be CREATED or OPENED”. due to permissions or something else.
       */
      try {
         PrintWriter ref1 = new PrintWriter("data.txt");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      // !2. PrintWriter(String fileName, String charsetName) (rarely used)
      // Why this exists
      // Lets you control encoding
      // Important in internationalization
      try {
         PrintWriter ref2 = new PrintWriter("data.txt", "UTF-8");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (UnsupportedEncodingException e) {
         e.printStackTrace();
      }
      // !3.PrintWriter(File file)
      // Same behavior as constructor #1, just takes a File
      File f = new File("data.txt");
      try {
         PrintWriter ref3 = new PrintWriter(f);
      } catch (IOException e) {
         e.printStackTrace();
      }
      // ! 4. PrintWriter(BufferdWriter/ FileWriter obj)
      // * Better to use BufferWriter which will give effictWriting */
      FileWriter fw = null;
      try {
         fw = new FileWriter("data.txt");
      } catch (IOException e) {
         e.printStackTrace();
      }
      PrintWriter ref3 = new PrintWriter(new BufferedWriter(fw));

      // ! 5.PrintWriter(Writer out, boolean autoFlush)
      /*
       * autoFlush = true means:
       * Flushes automatically when:
       * println()
       * printf()
       * format()
       * ❗ Does NOT auto-flush on print()
       */
      FileWriter fw1 = null;
      try {
         fw1 = new FileWriter("data.txt", true);
      } catch (IOException e) {
         e.printStackTrace();
      }
      PrintWriter ref4 = new PrintWriter(new BufferedWriter(fw1), true);
      // ! 6.PrintWriter(OutputStream out)
      // Used to print formatted output to:
      // Console
      // Network streams
      PrintWriter ref5 = new PrintWriter(System.out);
      // ! 7. PrintWriter(OutputStream out, boolean flush)
      PrintWriter ref6 = new PrintWriter(System.out, true);

   }
}
