import java.util.Set;
import java.util.TreeSet;

public class Assignment {
    public static void main(String[] args) {
        Student s1= new Student("Ravi", 20);
        Student s2= new Student("Ravi", 18);
        Student s3= new Student("Abhi", 20);
        Student s4= new Student("Vebhav", 20);
        Student s5= new Student("Ravi", 20);
        Student s6= new Student("Abhi", 30);
        Set<Student> set = new TreeSet<>(Set.of(s1,s2,s3,s4,s5,s6));
        System.out.println(set);

    }
}
