 class singleton {
    private static singleton singletonObj= new singleton();//* for eager inislization */
    private singleton(){
         
    }
    public  static singleton getObj(){
        if(singletonObj == null){
            singletonObj = new singleton();
        }
        return singletonObj;
    }

}

public class mainclass1{

    public static void main(String[] args) {
      singleton obj1=  singleton.getObj();
      System.out.println(obj1);
      singleton obj2=  singleton.getObj();
      System.out.println(obj2);
    }
}