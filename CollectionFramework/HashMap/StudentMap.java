import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Student s1= new Student("Ravi", 1);
        Student s2= new Student("Aman", 2);
        Student s3= new Student("Ravi", 3);
        Student s4= new Student("Aryan", 4);
        Student s5= new Student("Ravi", 5);
        Student s6= new Student("Aman", 6);
        Map<Student,Integer> map= new HashMap<>();
        map.put(s1, 67);
        map.put(s2, 77);
        map.put(s3, 92);
        map.put(s4, 78);
        map.put(s5, 67);
        map.put(s5, 100);
        System.out.println(map);
    }

}
