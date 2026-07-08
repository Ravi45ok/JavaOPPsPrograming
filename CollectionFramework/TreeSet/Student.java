public class Student implements Comparable<Student> {

    int age;
    String name;
    Student( String name, int age){
        this.age= age;
        this.name=name;
    }

    @Override
    public int compareTo(Student other) {
     
        if(this.name.compareTo(other.name) !=0){
               return this.name.compareTo(other.name);
        }
        return this.age-other.age;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + "]" ;
    }


}
