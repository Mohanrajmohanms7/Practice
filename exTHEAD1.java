public class exTHEAD1 implements Runnable{

    public void run()
    {
        System.out.println("This code is running in a thread");
    }

    public static void main(String []ms)
    {
        exTHEAD1 obj=new exTHEAD1();
         Thread T=new Thread(obj);
         T.start();

        System.out.println("This code is outside of the thread");

    }
    
}
