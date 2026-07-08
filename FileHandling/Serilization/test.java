package Serilization;

import java.io.Serializable;

public class test implements Serializable {
    int id;
    String name;
    transient Long password;
    test(int id, String name, long password){
          this.id=id;
          this.name=name;
          this.password= password;
    }
    void display(){
        System.out.println("Student detials is:");
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
        System.out.println("Password : "+ id);
    }
}
