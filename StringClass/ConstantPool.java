public class ConstantPool {
    public static void main(String[] args) {
        String str1= "hello";
        String str2= "hello";
        System.out.println(str1==str2);// true because pointing to same object 
        String str3= new String("hello");
        System.out.println(str1==str3);// false because new object will be created
        String str4= new String("hello");
        System.out.println(str3==str4);// false because new object will be created
        String str5="hellohello";
        String str6= str1+str2;
        System.out.println(str5==str6);// false because at compile time compiler cannot garauntee there values. they will be resolve at runtime and new object will be created at heap in runtime
        String str7= "hello"+"hello";
        System.out.println(str5==str7);// true becauese at compile time only compiler getting the literals and it concatinate them and store them in string pool
        final String a = "hi";
        final String b = "hi";
        String c = a + b;
        String d = "hihi";
        System.out.println(c == d);// true , as a and b are final and there value cannot be change during the operations so compiler resolve the values of a and b at compile time only. and concatinate them.

        // ! intern()

        String str8= str3.intern(); // it will try to create an object of str3 in string pool ans object is alrady present in constant pool so it will just point to same object along with str1 and str2
        System.out.println(str1== str8); // true, reason is upper line
    }
}
