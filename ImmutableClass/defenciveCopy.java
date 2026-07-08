 class A{
    int x;
    String str;
    A(int x, String str){
        this.x=x;
        this.str=str;
    }
    A(A a){//Copy Constructor
        this.x= a.x;
        this.str= a.str;
    }
 }

public final class  defenciveCopy {
   private final int p;
   private  final A a;
   
     defenciveCopy(int p, A a){
        this.p=p;
        this.a= new A(a);// defencive copy with the help of copy constructor

        //! OR
        /*
            this.p=p;
            this.a = new A(0, null);
            this.a.x= a.x;
            this.a.str= a.str;
         */
     }
     
     A getA(){
        A a= new A(this.a);// defencive copy with the help of copy constructor
        return a;

        //! OR
        /*
        this.a = new A(0, null);
        a.x= this.a.x;
        a.str= this.a.str;  
         */

     }

    public static void main(String[] args) {
        A a= new A(10, "hello");
        defenciveCopy dc= new defenciveCopy(25, a);
        a.x=45;
        System.out.println(dc.a.x);
    }
}
