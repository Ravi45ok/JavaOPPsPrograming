public class IntClass{
    
    /**
     * Demonstrates wrapper class auto-unboxing and explicit unboxing in Java.
     * 
     * This main method illustrates:
     * 1. Auto-unboxing: Automatic conversion of Integer wrapper object to primitive int
     * 2. Equality comparison between wrapped Integer and primitive int values
     * 3. Explicit unboxing: Using intValue() method to convert Integer to int
     * 
     * **/
    public static void main(String[] args) {

        Integer i=10;
        System.out.println(i);
        int x=i;
        System.out.println(i==x);
        System.out.println("-----------------------------------------");
        // ! intValue()---> this is use in auto Unboxing 
        Integer j = 10;
        int y = j.intValue();
        System.out.println(y);

          System.out.println("-----------------------------------------");
       /* *Note: The intValue() method is implicitly called during mathematical operations
       * on Integer wrapper objects. When performing arithmetic operations on an Integer,
       * Java automatically invokes intValue() to extract the primitive int value,
       * allowing the operation to proceed with primitive types.
       */
      // ! toString()
       int z=20;
       Integer k= z;
       String str= k.toString();
       System.err.println(str);
       // * to convet int to String frist we will convert int into Interger object then will use toString method
       // * also we can use valueOf() method of String class to conver primitive value into string
            System.out.println("-----------------------------------------");


       //! valueOf(int / String)   --> this is use in auto boxing , Static  
       Integer a= 46; // internally  Inerger a = Interger.valueof(46);
       Integer b= Integer.valueOf("56");
       int c = Integer.valueOf("78");// this will return a Interger object and autoUnboxing will happen here
       System.out.println(b);
       System.out.println(c);
       System.out.println("-----------------------------------------");

       // ! ParseInt(String) ---> Static method
        
       int d= Integer.parseInt("99");
       System.err.println(d);
       //System.out.println(Integer.parseInt("34.6")); NumberFormatException

       // * for converting string "24" into int data type better to use ParseInt then valueOf which will return the object

       // * Parsexxx()-> to convert into primitive
       // * valueOf()-> to convert into objcet or non primitive
       // * worng parsing will give NumberFormatException
      
       // ! equals(Object) ----> non-static Method
         Integer m=30;
         System.out.println(  m.equals(30));
    
         // ! compareTo(Integer)
         //* it will return positive when frist value is more , negitive when anthor value is more , 0 when both are equals
           
         Integer n = 50;
         System.out.println(n.compareTo(78));
         // ! MAX_VALUE, MIN_VALUE  ----> these are properties of Intergerclass
           
         i= Integer.MAX_VALUE;
         System.out.println(i);
         i=Integer.MIN_VALUE;
         System.out.println(i);


         // !Boolean.parseBoolean() never throws NumberFormatException. It returns true only if the input string equals "true" (ignoring case). For any other value, including invalid strings and null, it simply returns false

    }
}