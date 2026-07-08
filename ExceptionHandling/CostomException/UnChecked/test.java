package CostomException.UnChecked;

public class test {
   static void AgeVerification(int age) {
         if(age< 18){
            throw new InvalidAgeException("Age cannot be less than 18");
            
         }else{
            System.out.println("valid Age");
         }
    }
    public static void main(String[] args) {
        try{
            AgeVerification(17);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
