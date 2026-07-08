public class genricClass<T> {
   T value;
  

   genricClass(T value) {
      this.value = value;
   }

   void setValue(T value) {
      
      this.value = value;
   }

   T getValue() {

      return value;
   }

   public static void main(String[] args) {
        genricClass<String> obj= new genricClass<String>("Hii");
        obj.setValue("Ravi");
        String value= obj.getValue();
      
        
   }
}
