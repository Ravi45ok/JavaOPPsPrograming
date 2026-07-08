

public class Person {
    String name;
    int age;
    String gender;
    private int a = 10;
    static int p =10;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    final void fun(){
        System.out.println("final");
    }
    private void privateFun(){
        System.out.println("I am a private function of person class");
    }
    static void StaticFun(){
        System.out.println("I am a static function  of person class");
    }
    public void display(){
          System.out.println(name);
          System.out.println(age);
          System.out.println(gender);
    }
    protected void func(){
        System.out.println("It is a protected method");
    }
}
