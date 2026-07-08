

public class ObjectSubstitution {
  public static void main(String[] args) {
    System.out.println("--------------------");
    Person p1;
    // = new Person("Rohit", 21, "Male");
    Employee e1 = new Employee("Ravi", 21, "male", 45, 1500000, 1.5);
    student s1 = new student("Rani", 18, "Female", 46, 500000, "jaipur High school");
    p1 = e1;
    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p1.gender);
    p1 = s1;
    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p1.gender);
    // s1 =p1 Not possile because child cannot be substitued by the child
    System.out.println("--------------------");

  }
}
