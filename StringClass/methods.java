public class methods {
    public static void main(String[] args) {
        // ! length()
        // *give the length of string
        // * time complextiy-> O(1)
        String str = "this is string objct ";
        System.out.println(str.length());
       // ! concat()
         str= str.concat(str);
         System.out.println(str);
        // !isEmpty()
        // * check weather the length is zero or not
        // *time complextiy-> O(1)
        System.out.println(str.isEmpty());
        // ! charAt()
        // * char at given position
        // * time complextiy-> O(1)
        System.out.println(str.charAt(5));
        // ! equals(Object o)
        // * comparasion of content
        // * time complexity -> O(n)
        // ! equalsIgnoreCase(String s)
        // * comparasion of content with ignoring the case sensetivtiy
        // * time complexity -> O(n)

        // ! substring(int beginIndex, int endIndex)
        // * returns substring from beginIndex to endIndex-1
        // * time complexity -> O(n)
        System.out.println(str.substring(0, 4));

        // ! indexOf(char/String)
        // * returns first occurrence index of character or substring
        // * time complexity -> O(n)
        System.out.println(str.indexOf('s'));

        // ! lastIndexOf(char/String)
        // * returns last occurrence index of character or substring
        // * time complexity -> O(n)
        System.out.println(str.lastIndexOf('s'));

        // ! contains(CharSequence s)
        // * checks if string contains the given substring
        // * time complexity -> O(n*m)
        System.out.println(str.contains("string"));

        // ! startsWith(String prefix) / endsWith(String suffix)
        // * checks if string starts or ends with given prefix/suffix
        // * time complexity -> O(n)
        System.out.println(str.startsWith("this"));

        // ! toCharArray()
        // * converts string to character array
        // * time complexity -> O(n)
        char[] chars = str.toCharArray();

        // ! split(String regex)
        // * splits string based on regex pattern
        // * time complexity -> O(n)
        String[] words = str.split(" ");

        // ! replace(char oldChar, char newChar) / replace(String old, String new)
        // * replaces all occurrences of character or substring
        // * time complexity -> O(n)
        System.out.println(str.replace('s', 'S'));

        // ! trim()
        // * removes leading and trailing whitespaces
        // * time complexity -> O(n)
        System.out.println("  hello  ".trim());

        // ! compareTo(String s)
        // * lexicographic comparison, returns difference in Unicode values
        // * time complexity -> O(n)
        System.out.println(str.compareTo("this is string objct"));

        // ! valueOf(primitive type/non-primitiveType)
        // * converts primitive types to string representation and non-primitve return toString value
        // * time complexity -> O(n) depending on the type
        int num = 42;
        String str1=String.valueOf(num); 
        System.out.println(str1);
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(3.14));
        Constructors con= new Constructors();
        System.out.println( String.valueOf(con));

        // ! toCharArray() - another example
        // * converts string to character array
        // * time complexity -> O(n)
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("abcf".compareTo("abe"));
    }

}
