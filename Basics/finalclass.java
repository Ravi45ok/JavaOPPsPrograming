package Basics;

public final class finalclass extends notfinalclass {
     int a = 10;
     int b=20;
     public static void main(String[] args) {
        finalclass obj = new finalclass();
        obj.a=30;
        obj.b=40;
        System.out.println(obj.a);
        System.out.println(obj.b);
     }
}
class trytoinherit extends finalclass{
    // this will give error because final class cannot be inherited
}
class notfinalclass {
    int a = 5;
}
