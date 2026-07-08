public class Constructors {
  @Override
  public String toString() {
      return "constructor";
  }
    public static void main(String[] args) {

        // ! if any where the input is not constant the time complxity will be O(n)
        //! String()
        // * Creates an empty string ""
        String s1 = new String();

        //! String(String literal)
        //*  Creates a new String object with same content
        String s2= new String("hello");

        // ! String(char[] arr)
        //* Copies characters from array and create String
        //* time complexity O(n) if array is not constant
        char arr[]={ 'a','b','c'};
        String s3= new String(arr);
        System.out.println(s3);
        
      // ! String(StringBuilder builder)
      //*  Copies content from builder and Create a String
      StringBuilder sb = new StringBuilder("hi");
      String s4= new String(sb);

      // ! String(StringBuffer buffer)
      //*  Copies content from buffer and Create a String
      StringBuilder Sb = new StringBuilder("hi");
      String s5= new String(Sb);

    // ! String(byte[] bytes)
    //* Converts byte array to String using default charset
    //* time complexity O(n)
    byte[] bytes = {72, 101, 108, 108, 111};
    String s6 = new String(bytes);
    System.out.println(s6);

    // ! String(byte[] bytes, int offset, int length)
    //* Converts part of byte array to String
    //* time complexity O(length)
    String s7 = new String(bytes, 0, 3);
    System.out.println(s7);

    // ! String(char[] value, int offset, int count)
    //* Copies characters from array starting at offset with count
    //* time complexity O(count)
    String s9 = new String(arr, 0, 2);
    System.out.println(s9);

    // ! String(int[] codePoints, int offset, int count)
    //* Creates String from array of unicode code points
    //* time complexity O(count)
    int[] codePoints = {72, 105};
    String s10 = new String(codePoints, 0, 2);
    System.out.println(s10);


    }

    
  
}
