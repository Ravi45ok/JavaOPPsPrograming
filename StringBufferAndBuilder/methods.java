class A{
        @Override
        public String toString() {
            return "toString";
        }
    }

public class methods {
    
    public static void main(String[] args) {
        // ! StringBuider and StringBuffer carry same methods 
        // !  length()
        // *Returns number of actual characters (count)
        // *Complexity-O(1)
        StringBuilder s1= new StringBuilder("hello");
        System.out.println(s1.length());
        //! charAt()
        //*  returns the charter at given index
        System.out.println(s1.charAt(2));

        // ! s1+"bye"; will not work becuase "bye" is a string type object

        // ! append(overloaded)
        //* it is overloaded and almost take all types of primitive and non-primitve data
        //*  Adds data at the end, modifes the same object
        //*  Complexity -O(1)

        StringBuilder s2= new StringBuilder("hii");
        s2.append(s1);
        System.out.println(s2);
        System.out.println(s2.length());
        s2.append(13.4);
        System.out.println(s2.length());
        System.out.println(s2);
        s2.append(56);
        System.out.println(s2);
        System.out.println(s2.append('a'));
        System.out.println(s2.append(true));
        char[] arr= {'a','b'};
        System.out.println(s2.append(arr));
        // ! it also takes object as perameter and concatinate the string return by toString method of that object
        A a= new A();
       System.out.println(s2.append(a));

       // ! insert(int index, overloaded);
       //* inserts at given index shift charaters to the right 
       //* complexity ->O(n)
       StringBuilder s3= new StringBuilder("javaScript");
       s3.insert(4, "ki");
       s3.insert(4, 'a');
       s3.insert(5, 22);
       System.out.println(s3);
       s3.insert(4, a);
       System.out.println(s3);
       // !deleteCharAt(int index)
       //* delete charater at given index
       //*  Complextiy-> O(n)
       // ! reverse()
       //*   reverse the string 
       //* complxtiy O(n) 
      System.out.println(s3.reverse());
      // ! toString 
      // * conver stringBulider object into String Object
      // * complxity-> O(n)
      // ! substring(int start) ,subString(int start , int end)
      //*  it retunrns a  String type object
      //*  Complexity->O(n)
      StringBuilder s4=new StringBuilder("Hello hi bye");
      String str=s4.substring(2);
      System.out.println(str);
    String str2=s4.substring(2, 5);
    System.out.println(str2);
    // ! delete(int start, int end)
    //* deletes characters from start index to end index (end exclusive)
    //* Complexity-> O(n)
    StringBuilder s5= new StringBuilder("HelloWorld");
    s5.delete(5, 10);
    System.out.println(s5);
    // ! deleteCharAt(int index)
    //* deletes character at given index
    //* Complexity-> O(n)
    s5.deleteCharAt(0);
    System.out.println(s5);
    // ! replace(int start, int end, String str)
    //* replaces characters from start to end with given string
    //* Complexity-> O(n)
    StringBuilder s6= new StringBuilder("JavaProgramming");
    s6.replace(0, 4, "Python");
    System.out.println(s6);
    // ! capacity()
    //* returns the capacity of StringBuilder
    //* Complexity-> O(1)
    System.out.println(s6.capacity());
    // ! ensureCapacity(int minCapacity)
    //* ensures minimum capacity
    //* Complexity-> O(1)
    s6.ensureCapacity(50);
    System.out.println(s6.capacity());
    // ! setCharAt(int index, char ch)
    //* sets character at given index
    //* Complexity-> O(1)
    s6.setCharAt(0, 'J');
    System.out.println(s6);
    // ! setLength(int newLength)
    //* sets new length, truncates or pads with null
    //* Complexity-> O(1)
    s6.setLength(5);
    System.out.println(s6);

    
    } 
}
