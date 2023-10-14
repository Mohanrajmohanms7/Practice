import java.util.Scanner;                    //  i use THREAD  CLASS AND scanner class
public class exTHREAD2 implements Runnable 
{
    Scanner in =new Scanner(System.in);

    public  void run()
    {
         System.out.println("Enter the number:");
         int i=in.nextInt();
         int i1=in.nextInt();
          System.out.println("calculation:"+(i+i1));
        
    }
    public static void main(String [] msd)
    {
        exTHREAD2 E=new exTHREAD2();
        Thread T=new Thread(E);
        T.start();
        System.out.println("...main class...");
    }
}
