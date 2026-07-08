package CostomException.Checked;

public class test {
    static void AgeVerification(int age) throws InvalidAgeException{
         if(age< 18){
            throw new InvalidAgeException("Age cannot be less than 18");
            
         }else{
            System.out.println("valid Age");
         }
         System.out.println("Age is varified for vaild age");
    }

    static void  resultChecking(int marks) throws studentFailedException{
         if(marks < 33){
            throw new studentFailedException();
         }else{
            System.out.println("student is passed");
         }
    }
    public static void main(String[] args) {
    
        try{
            AgeVerification(27);
            AgeVerification(17);
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }

        try{
            resultChecking(22);
            resultChecking(55);
        }catch(studentFailedException e){
            e.printStackTrace();
        }
        System.out.println("main method is still excuting");


        
    }
}
