public class demo2 {
    
    static int fun(){
        try{
            int a=1/0;
            System.out.println("try block executed");
          return 10;
        }catch(ArithmeticException e){
            e.printStackTrace();
             return 15;// * finally will ovrride this value as well if return exist in finally
        }
        finally{
            System.out.println("finally has runned");
         return 20;//*If you return from the finally block, it suppresses (overrides) any exception thrown in the try or catch block. */
        }
    }
    public static void main(String[] args) {
       int x= fun();// * this will not give any exception now becuase finally will execute at last and it will override evrything by returning the requried value;
       System.out.println(x);
       
    }
}
