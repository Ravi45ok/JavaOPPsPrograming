public class copyConstructor {
    int x;
    String str;
    copyConstructor(int x, String str){
        this.x=x;
        this.str=str;
    }
    copyConstructor(copyConstructor cc){
        this.x= cc.x;
        this.str=cc.str;
    }
    public static void main(String[] args) {
        copyConstructor cc1= new copyConstructor(10,"helll0");
        copyConstructor cc2= new copyConstructor(cc1);
        System.out.println(cc2.x);
        System.out.println(cc2.str);
    }
}
