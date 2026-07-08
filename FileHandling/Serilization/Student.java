package Serilization;

import java.io.Serializable;

public class Student implements Serializable {

    // version control (VERY IMPORTANT)
   //private static final long serialVersionUID = 1L;
   //*serialVersionUID is a version identifier used during deserialization to ensure that a loaded class is compatible with the serialized object; it is not mandatory but strongly recommended to define explicitly. */

    int id;
    String name;
    transient String password;   // *will NOT be serialized, means it value will be default 

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    void display() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Password : " + password);
    }

}

