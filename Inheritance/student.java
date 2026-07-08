
public class student extends Person {
    int rollNo;
    double markrs;
    String schoolName;

    student(String name, int age, String gender, int rollNo, double marks, String schoolName) {
        super(name, age, gender);
        this.rollNo = rollNo;
        this.markrs = marks;
        this.schoolName = schoolName;
    }
}
