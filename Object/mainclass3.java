package Object;
class forEquals{
    int x =10;
    int y=26;
    @Override
    public boolean equals(Object obj) {
        forEquals e = new forEquals(this.x, this.y);
        if(e.x == ((forEquals)obj).x &&  e.y == ((forEquals)obj).y){
             return true;
        }
        else return false;
    }
    forEquals(int x , int y){
        this.x = x;
        this.y=y;
    }
}
public class mainclass3 {
   public static void main(String[] args) {
     forEquals e1 = new forEquals(5,9);
    forEquals e2 = new forEquals(5,9);
    System.out.println(e1.equals(e2));
    System.out.println(e1.hashCode() == e2.hashCode());
    
   }
}
