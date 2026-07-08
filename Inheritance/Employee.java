

public class Employee extends Person {
    int id;
    double salary;
    double exp;
    private int  a= 10;
    
    public Employee(String name, int age, String gender, int id, double salary, double exp) {
        super(name, age, gender);
        this.id = id;
        this.salary = salary;
        this.exp = exp;
    }
    private void privateFun(){
        System.out.println("I am a private function of employee class");
    }
    static void StaticFun(){
        System.out.println("I am a static function  of employee class");
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(id);
        System.out.println(salary);
        System.out.println(exp);
    }

}
