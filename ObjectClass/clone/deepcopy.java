public class deepcopy implements Cloneable {
    int x;
    Demo d;
    deepcopy(int x, Demo d){
        this.x=x;
        this.d=d;
    }
    @Override
    // ! after override we can increase the visiblity
    public deepcopy clone() throws CloneNotSupportedException {
        
        deepcopy newObject= (deepcopy)super.clone();
        newObject.d= new Demo();
        newObject.d.a= this.d.a;
        newObject.d.b= this.d.b;
        return newObject;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        deepcopy dp1= new deepcopy(6, new Demo());
        deepcopy dp2=dp1.clone();
        System.out.println(dp1.d.a);
        dp2.d.a=50;
        System.out.println(dp1.d.a);
    }
}
