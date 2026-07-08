public class multiCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            String s = null;
            s.length();
           
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic issue");
        } catch (NullPointerException e) {
            System.out.println("Null issue");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }catch(Exception e){
            System.out.println("Exception");
        }
        // ! multi-catch block
        //* | is called Multi-catch separator */
         try {
            int a = 10 / 0;
            String s = null;
            s.length();
           
        }catch(ArithmeticException | NullPointerException e){
            System.out.println("it might throws Arithematic or nullpointerException");
        }
    }
}
