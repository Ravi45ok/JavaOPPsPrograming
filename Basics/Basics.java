package Basics;

import java.util.Scanner;


 public class Basics {
   
}
class B{
    public static void main(String[] args) {
            System.out.println("Hello World");
    }
    }

/*
 * 1. if we are calling a static function inside the same class we don't need
 * class name to call it but if we are calling it into the class there we will
 * need class name
 */
/*
 * 2. varargs should be the last parameter of the function otherwise it will
 * give error
 */
/*
 * 3. varargs can take 0 or more arguments and it is treated as an array inside
 * the function
 */
/*
 * when ever we inherit a class it does not mean we are modifiy the class ,
 * Inheritance means super class properties are part of sub class. we are not
 * modifiy the structure of subclass or super class.
 */

/*
 * 4. we cannot overload a function by changing only the return type of the
 * function
 */
/*
 * 5. we cannot create the object of the class which is declared as private.
 * Even we cannot
 * create a top class as private class. check privateclass.java file for more
 * info.
 */

/*
 * 6. we cannot inherit a class which is declared as final. making a class final
 * means it cannot have any subclass.And its methos cannot be overridden. for
 * more info check finalclass.java file
 */

/*
 * 8. final class can inherit other classes but other classes cannot inherit
 * final class. for more info check finalclass.java file
 */

/*
 * 7. we cannot override a function which is declared as final
 */

/*
 * 9. static function can be called by using class name or by using object of
 * the class
 */

/*
 * 10. static function cannot access non static members of the class directly.
 * for more info check staticClass.java file
 */

/*
 * 11. static block is used to initialize the static members of the class
 */

/*
 * 12. static block is executed only once when the class is loaded
 */

/*
 * 13. we can overload the main function
 */

/*
 * 14. main function is static because it is called by the JVM without creating
 * the object of the class
 */

/*
 * 15. main function is public because it is called by the JVM from outside the
 * class
 */

/*
 ! 16. JVM calls the main function with string array as argument which
 ! contains the command line arguments
 */

/*
 * 18. JVM calls the main function which has string array as argument
 */

/*
 * 19. we can run a java program without main function by using static block. Till java6 static block was allowed to run a java program without main function but from java7 onwards it is not allowed.
 */

/*
 * 20. we can run a java program without main function by using static function. till java6 static function was allowed to run a java program without main function but from java7 onwards it is not allowed.
 */

/*
 * 25. we can have only one public class in a java file
 */

/*
 * 26. the name of the public class should be same as the name of the java file
 */

/*
 * 27. we can have multiple classes in a java file but only one class can be
 * public
 */

/*
 * 28. if we don't have any public class in a java file then the name of the
 * java file can be anything
 */

/*
 TODO: 29. we can have a class inside another class which is called nested class
 */

/*
 * 30. we can have a static nested class which is called static nested class
 */

/*
 * 31. we can have a non static nested class which is called inner class
 */

/*
 * 32. we can access the members of the outer class inside the inner class
 * directly
 */

/*
 * 33. we cannot access the members of the inner class inside the outer class
 * directly
 */

/*
 * 34. we can create the object of the inner class only by using the object of
 * the outer class
 */

/*
 * 35. we can create the object of the static nested class without using the
 * object of the outer class
 */

/*
 * 36. we can have local class inside a function
 */

/*
 * 37. we can have anonymous class which is a class without a name
 */

/*
 * 38. we can use lambda expressions to create anonymous functions
 */

/*
 * 39. we can use functional interfaces to create lambda expressions
 */

/*
 * 40. we can use method references to refer to a method of a class
 */

/*
 * 41. we can use constructor references to refer to a constructor of a class
 */

/*
 * 42. we can use streams to process collections of data
 */

/*
 * 43. we can use filters to filter the data in streams
 */

/*
 * 44. we can use maps to transform the data in streams
 */

/*
 * 45. we can use reduces to aggregate the data in streams
 */

/*
    * 46. we can use collectors to collect the data in streams

 */

/*
 * 47. we can use parallel streams to process the data in parallel
 */

/*
 * 48. we can use optional to handle null values
 */

/*
 * 49. we can use date and time API to work with date and time
 */

/*
 * 50. we can use nio package to work with files and directories
 */

