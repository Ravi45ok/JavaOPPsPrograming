package Object;
class forHashCode{
    int x;
    int y;
    @Override
    public int hashCode() {
        return 45;
    }
    forHashCode(int x, int y){
        this.x =x;
        this.y= y;
    }
}
public class mainclass2 {
   public static void main(String[] args) {
     forHashCode h1= new forHashCode(4,9);
    forHashCode h2= new forHashCode(10,20);
     System.out.println(h1.hashCode());
     System.out.println(h2.hashCode());
   }
}
