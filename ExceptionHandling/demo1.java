import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo1 {
    int x = 10;

    public demo1() throws FileNotFoundException {

    }
     //* As non-static block execute inside constructor so exception inside non-static block can be propogate through construtor */
    {
        System.out.println("this is a non-static block");
        FileReader fr = new FileReader("a.txt");
    }
    //* exception in static block cannot be propogate they must be  handeled by the programer where it is writtern */
    static {
        try {
            FileReader fr1 = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            demo1 d = new demo1();
        } catch (FileNotFoundException e) {
            System.out.println("exception has been handeled");
        }
    }
}
