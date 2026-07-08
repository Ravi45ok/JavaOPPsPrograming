class Y {
    int a = 10;
    int b = 20;
}

public class X implements Cloneable {
    int x = 40;
    int y = 50;
    Y y1 = new Y();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        X newObject=new X();
        newObject.x= this.x;
        newObject.y=this.y;
        
        newObject.y1= new Y();
        newObject.y1.a= this.y1.a;
        newObject.y1.b= this.y1.b;
        return newObject;



    }

    public static void main(String[] args) throws CloneNotSupportedException {
        X x1 = new X();
        X x2 = (X) x1.clone();
        System.out.println(x1.y1== x2.y1);
    }
}
