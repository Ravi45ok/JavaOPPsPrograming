 interface example  {
     void demo();
}
enum day implements example{
    
     SUNDAY(45){
        @Override
        void test() {
            System.out.println("this enums has become abstact so overide it at each object");
        }
     }, MONDAY(34){
        @Override
        void test() {
            System.out.println("this enums has become abstact so overide it at each object");
        }
     }, TUESDAY(67){
        @Override
        void test() {
            System.out.println("this enums has become abstact so overide it at each object");
        }
     };
      int x;
     day(int x){
       this. x=x;
     }
     @Override
     public void demo() {
          System.out.println("mandatory to override the interface method commonly or object by object");
     }
     //* It can have abstract methods also */
     abstract void test();

     public void fun(){
        System.out.println("method defined for enum");
     }
     
}


public class Enums {
  public static void main(String[] args) {
     day d= day.SUNDAY;
    System.out.println(d.x);
    d.x=100;//* here we are able to change it but ideally it should not, for that x should be private and final */
     System.out.println(d.x);
    // ! methods->
    // ! values()-> it returns the array of constant object.static method
    day[] days= day.values();
    for(day D: days){
        System.out.println(D);
    }
    // ! valueOf()-> Returns enum constant whose name exactly matches the string.static method
      day d1= day.valueOf("SUNDAY");
      System.out.println(d1);
      // ! ordianl()->Returns position index of constant.
      System.out.println(d.ordinal());
      // ! name() -> Returns exact declared name of enum constant.
      System.out.println(d.name());
  }
  

  
}
