package Serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerilizable {

    public static void main(String[] args) {

        try {
            // 1. Create object
            Student s1 = new Student(101, "Ravi", "secret123");

            // 2. Create FileOutputStream
            FileOutputStream fos =
                new FileOutputStream("C:\\JavaOpps\\FileHandling\\Resourses\\Student.ser");

            // 3. Create ObjectOutputStream
            ObjectOutputStream oos =
                new ObjectOutputStream(fos);

            // 4. Serialize object
            oos.writeObject(s1);//*it will throw NotSerilzableException if the object does not implemts Serilizable */

            // 5. Close streams
            oos.close();
            System.out.println("Object serialized successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

