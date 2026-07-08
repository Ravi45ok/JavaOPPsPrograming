public class constructors {
    public static void main(String[] args) {
        //! Both StringBuffer and builder has the same constructors
        //! StringBuilder()
        //* it will create zero length of String 
        //* it will create builder capacity of 16 (capacity of internal char array)
        StringBuilder sb1= new StringBuilder();
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        //! StringBuilder(String str)
        //* it will create a StringBuilder initialized with the specified string
        //* it will create builder capacity of 16 + size of input string
        StringBuilder sb2 = new StringBuilder("Hello");
         System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        // ! StringBuilder(int capacity)
        //* */ it will create a StringBuilder with the specified initial capacity and it will be a empty String 
         StringBuilder sb3 = new StringBuilder(50);
         System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        //! StringBuilder(CharSequence seq)
        // it will create a StringBuilder initialized with the specified CharSequence
        StringBuilder sb4 = new StringBuilder(new StringBuffer("World"));
         System.out.println(sb4);
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

    }
}
