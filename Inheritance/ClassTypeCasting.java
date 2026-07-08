
public class ClassTypeCasting {
    // Person is Superclass and Employee is Subclass
    public static void main(String[] args) {
        Person p1 = new Person("Riya", 45, "Female");
        Employee e1 = new Employee("Ravi", 19, "Male", 1456, 67000, 2.7);
        System.out.println(p1);
        p1.display();
        System.out.println(e1);
        System.out.println(p1 instanceof Employee);
        System.out.println(p1 instanceof Person);
        System.out.println(e1 instanceof Employee);
        System.out.println(e1 instanceof Person);
        p1 = e1;
        System.out.println(p1 instanceof Employee);
        System.out.println(p1 instanceof Person);
        System.out.println(p1);
        e1 = (Employee) p1; // p1.display();
        System.out.println(e1 instanceof Employee);
        System.out.println(e1 instanceof Person);
        // e1.display();
    }
}