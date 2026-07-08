package Serilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserilizabile {

    public static void main(String[] args) {

        try {
            // 1. Open file containing serialized object
            FileInputStream fis =
                new FileInputStream("C:\\JavaOpps\\FileHandling\\Resourses\\Student.ser");

            // 2. Create ObjectInputStream
            ObjectInputStream ois =
                new ObjectInputStream(fis);

            // 3. Read object (DESERIALIZATION happens here)
            Student s = (Student) ois.readObject();//*readObject() throws ClassNotFoundException because, during deserialization, JVM must load the class of the serialized object, and that class may not be present on the classpath. */

            // 4. Close streams
            ois.close();// this should be happen in finally block

            System.out.println("Object deserialized successfully\n");

            // 5. USE the object like a normal object
            s.display();

            // You can also access fields directly
            System.out.println("\nUsing object values:");
            System.out.println("Student Name in Uppercase: "
                               + s.name.toUpperCase());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

