package Mini_project;

public class Employee {
    String name;
    double exp;
    double salary;
    int id;

    public Employee(String name, double exp, double salary, int id) {
        this.name = name;
        this.exp = exp;
        this.salary = salary;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println(name + "\t" + exp + "\t" + salary + "\t" + id);
    }
}
