public  final class thradeSafty {

    private final int x;

    thradeSafty(int x) {
        this.x = x;
    }


    public static void main(String[] args) {
        thradeSafty th= new thradeSafty(10);
        System.out.println(th.x);
         thradeSafty th1= new thradeSafty(20);
         System.out.println(th1.x);

    }

    // !Immutable classes are thread-safe because their state cannot change after object creation. Since no thread can modify the object's data, multiple threads can safely read the same object without synchronization.

//     Once constructor finishes

//    final fields are fully initialized

//    Any thread seeing the object will see correct values  

// ! whenever a non-final variable is insilized in a object with the help of constructor , there is a possiblility that the other thrade might access the varible before the execution of the constructor and that thrade will not get the exact value , will get 0. because it is not insilized yet. But when you make a variable final no thrade can access a varible before the complete object creation or constructor exectution.

}
