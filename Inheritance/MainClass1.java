
class Demo{
     static int x;
    final int z=10;

    //  private Demo(){

    // }
    final int fun(){
        return 29;
    }
   
}
class Test extends Demo{
    int y;
    int z=50;
    Test(){
        
    }
    // int fun(){

    // }
}


public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("eveything is  running perfectly");
        
        Demo b= new Test();
        System.err.println(b.z);
        System.out.println(b.fun());
       
    }
}

