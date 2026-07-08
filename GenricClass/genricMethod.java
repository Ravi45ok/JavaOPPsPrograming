class calculator{
    static <T extends Number> double add(T a, T b){
           return a.doubleValue()+ b.doubleValue();
    }

    static <T extends Number,V> void print(T a, V b){
       System.out.println(a+" "+ b);
    }
}

public class genricMethod {
   
    public static void main(String[] args) {
       double ans1= calculator.add(5,6);
       System.out.println(ans1);
       ans1=calculator.add(5.6, 4.3);
        System.out.println(ans1);
        ans1= calculator.add(4, 5.5);//* frist argrumet will be autobox to Integer and Second argument will be autobox to Double so technically they are different so compiler here will put T as there parent Type Number  */
         System.out.println(ans1);
         int a=10;
         double b=5.5;
         ans1 = calculator.add(a, b);//*same logic here */
         System.out.println(ans1);
         //* print(10, "hello") it type will be Object */

         calculator.print(42, "hii");

        
    } 
}