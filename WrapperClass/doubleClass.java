public class doubleClass {
    public static void main(String[] args) {
        System.out.println(1/0);
        // ! isNaN(), isInfinite()
          
        System.out.println( Double.isNaN(0.0/0.0));
        System.out.println(Double.isInfinite(1/0.0));
        double x= 1/0.0;
        System.out.println(x);
        double y=1/0d;
        System.out.println(y);
        System.out.println("-------------------------------------");
        
        // ! All other methods are same


        // ! Important --->
    // System.out.println( 1 / 0 );     // ❌ ArithmeticException
    // System.out.println( 1 / 0.0 );   // Infinity
    // System.out.println( 1 / 0d );    // Infinity
    // System.out.println(-1 / 0.0 );   // -Infinity
    // System.out.println( 0.0 / 0.0 ); // NaN
     
     // Remember infinity inclues the decimal numbers also(mandatoraly). So a value is so large than how can we give a exact int value for it thefore int x= 1/0 throws Exception but double x = 1/0d give infinity , infinity cannot be a int type value it always be a double value
    }
    

}
