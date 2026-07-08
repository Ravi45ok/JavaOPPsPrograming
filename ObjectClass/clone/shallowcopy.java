public class shallowcopy implements Cloneable {
    int x;
    Demo d;
    shallowcopy(int x, Demo d){
        this.x=x;
        this.d=d;
    }
    @Override
    protected shallowcopy clone() throws CloneNotSupportedException {
        
        return (shallowcopy)super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        shallowcopy sh1= new shallowcopy(6, new Demo());
        shallowcopy sh2=sh1.clone();
        System.out.println(sh1.d.a);
        sh2.d.a=50;
        System.out.println(sh1.d.a);
    }
}
