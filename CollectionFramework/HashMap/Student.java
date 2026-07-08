public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "[name=" + name + ",rollNo=" + rollNo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return this.name.equals(s.name);
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
