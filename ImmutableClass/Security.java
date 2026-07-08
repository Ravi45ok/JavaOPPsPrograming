public final class Security {  
    private final int x;
    public Security(int x) {
        this.x=x;
    }
    // void setX(int x){
    //     this.x=x;

    // }  this will not work because we cannot inislize a final variable with the setter method ;

    int getX(){
        return x;
    }

    public static void main(String[] args) {
        Security s= new Security(10);
        System.out.println(s.getX());//  access through getX method
        
       // ! s.x=30;  this is not possible that why immutable classes are secure
    }
     
}
