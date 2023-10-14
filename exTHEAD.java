public class  exTHEAD extends thread
{
   public void run()
      {
          System.out.println("This code is running in a thread");
      } 
    public static void main(String [] ms)
    {
        exTHEAD thread=new exTHEAD();
        thread.start();

        System.out.println("This code is outside of the thread");
    }
    
    

}
