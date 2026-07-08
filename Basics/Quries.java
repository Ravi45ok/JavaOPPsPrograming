package Basics;
public class Quries {
   public static void main(String[] args) {
      Quries q;
   }
}

//1. Why multipule inheritance is not possible in java
// Ans: because if multiple inheritance is allowed then there will be ambiguity problem. for example if two parent classes have same method and child class inherits both parent classes then which method will be called by the child class that creates ambiguity problem. to solve this problem java provides interface which allows multiple inheritance.
// 2. understand the meaning  of importing something in a java file and how it is different from inheritance
// Ans: importing a class means we are using the class in our current java file. for example if we want to use Scanner class in our java file then we need to import it using import java.util.Scanner; statement. on the other hand inheritance means a class can inherit properties and behaviors of another class. for example if class B inherits class A then class B can use the properties and behaviors of class A.
// 3. why the object class need to be the parent of every class , i mean java.lang package is imported so we can use properties  or function form there only.
// 4. why there is no final block
// 5. at what time static and non-static block will be called
// 6. Study object class and exception handling by youtube
// ! why i need to extend or implement  for run() method for thrads