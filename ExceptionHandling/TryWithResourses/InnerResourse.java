package TryWithResourses;


public class InnerResourse implements AutoCloseable  {
  @Override
  public void close() throws Exception {
      System.out.println("Inner Resourse has been closed");
  }
}
