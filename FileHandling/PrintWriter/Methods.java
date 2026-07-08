package PrintWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Methods {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("print.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter ref = new PrintWriter(new BufferedWriter(fw), true);
        PrintWriter ref2= new PrintWriter(System.out, true);//* it will give write data on console */

        // ! void print() — write WITHOUT new line
        /*
         * What it does
         * Writes data as-is, no line break.
         * Overloads (important)
         * print(boolean b)
         * print(char c)
         * print(int i)
         * print(long l)
         * print(float f)
         * print(double d)
         * print(char[] s)
         * print(String s)
         * print(Object obj)
         */
        ref.print("hello");
        ref.print(56);
        char[] ch = { 'a', 'b', 'c' };
        ref.print(ch);
        ref.print("\n");
        ref.flush();
        // *just for example to print data on console
        ref2.print("hello");
        ref2.print(56);
        ref2.print(ch);
        ref2.print("\n");
        ref2.flush(); // * autoflush does not work for print() */
        // ! void println()
        /*
         * Writes data and then adds a newline.
         * Same overloads as print().
         */
        ref.println("hello");
        ref.println(56);
        ref.println(ch);
        // ! PrintWriter printf()
        /*
         * Writes formatted text, just like C’s printf.
         * Controls decimals
         * Controls alignment
         * Controls spacing
         * Professional output
         */
        ref.printf("Name: %s, Age: %d, CGPA: %.2f%n",
          "Ravi", 22, 8.567);
          ref2.printf("Name: %s, Age: %d, CGPA %.2f %n", "Rohit",46,9.33)
          .printf("Hello 24  %d %n", 34);
          // * %s-> stands for String type values and for object(toString)
          // * %d-> used for int, long , byte,short values
          // * %f -> used for float values
          // * %.2f-> decimal pricision till 2 values you can use 3, 4 etc.
          // * %n-> for newline, plateform indepedent.
          // !PrintWriter format()
          //* same work as printf() just naming differnce/ prefercene */
          ref.format("Name: %s, id: %d, percentage: %.4f%n","Rohit",24,78.487675);
          // ! write() and append() method also work here but we don't normally use them.
          // ! flush()
          //* automatic flush() only work for println, printf, format if we using print ,write or append then use this */
          ref.flush();
          // ! checkError()
          if (ref.checkError()) {
          System.out.println("Something went wrong!");
           }
           // ! close()// it should be used in finally block
           try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // bf.close()// if used
        ref.close();
        //! note->
        //* that is the one of sistution where it will give error  */
        //*using println after closeing stream */
        ref.println("hello");
         if (ref.checkError()) {
          System.out.println("now we got the error!");
           }

    }

}
