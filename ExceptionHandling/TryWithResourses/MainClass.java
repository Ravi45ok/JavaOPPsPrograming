package TryWithResourses;

public class MainClass {
    public static void main(String[] args) {
        InnerResourse iRes= new InnerResourse();
        MyResourese res= new MyResourese(iRes);
        try(res){
              res.fun(18);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
