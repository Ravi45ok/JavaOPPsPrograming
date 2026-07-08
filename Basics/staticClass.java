package Basics;

public class staticClass {
    int a = 10;
     int b = 20;
     static void fun(){
        System.out.println("I am a static function");
        System.out.println(a+b);// this will give error because static function cannot access non static variables directly
    } 
    public static void main(String[] args) {
        staticClass obj = new staticClass();
        obj.fun(); // calling static function by using object of the class
        staticClass.fun(); // calling static function by using class name
        
    }
}
