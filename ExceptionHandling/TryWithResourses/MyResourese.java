package TryWithResourses;

public class MyResourese implements AutoCloseable {

    InnerResourse iRes;

    MyResourese(InnerResourse iRes){
       this.iRes= iRes;
    }

    @Override
    public void close() throws Exception {
        iRes.close();
       System.out.println("The Main Resourese has been closed automatically");
    }


    public void fun(int value)throws Exception{
        if(value <=18){
            System.out.println("values has been accepted");
        }else{
            throw new Exception("value is grater then 18");
        }
    }

    
}