

public class MainClass {

    public static void main(String[] args) {
        System.out.println("--------------------");
        Person p1 = new Person("Rohit", 21, "Male");
        Employee e1 = new Employee("Ravi", 21, "male", 45, 1500000, 1.5);
        student s1 = new student("Rani", 18, "Female", 46, 500000, "jaipur High school");
        System.out.println("--------------------");
        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Employee);
        System.out.println(e1 instanceof Person);
        // System.out.println(e1 instanceof student); it will throw error because both
        // employye and student are indepent enities cannot be compaired
        System.out.println(s1 instanceof Person);
        System.out.println(p1 instanceof student);
        System.out.println("--------------------");
        Person.StaticFun();
        Employee.StaticFun();
        e1.StaticFun();
        p1.StaticFun();
        s1.func();
        System.out.println(e1.p);
    }
}