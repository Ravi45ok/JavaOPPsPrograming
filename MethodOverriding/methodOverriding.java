public class methodOverriding {
    
    // ! Access Modifier Widening

    // * While overriding a method, you can increase visibility, but you cannot reduce it.
    //*   private → default → protected → public

    // !  Exception Narrowing
       
    // * While overriding, a method cannot throw broader checked exceptions, but it can throw narrower ones.
      
    //*  java will consider that a method will throw the exception which is decleard in its parent and handle it accoring to that only so if now subclass method thows bigger exception it will not be able to handle by that try cateh block.

    // ! Return Type Covariance

    //* While overriding, the return type can be a subclass of the original return type.
     
    // * i mean if a method has a return type of Animal then retrurn  type Dog can handel it.





}
