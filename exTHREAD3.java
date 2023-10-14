import java.util.Scanner;        // i use THREAD CLASS  and Scanner class

public class exTHREAD3 extends  thread 
{    
    Scanner in=new Scanner(System.in);
    public static void main(String []msd)
    {
                

        exTHREAD3 E=new exTHREAD3();
        E.start();
        System.out.println("main class");
    }

  public void run()
    {
         System.out.println("Enter your name =");
         String name=in.next();
        System.out.println(" your learn java "+name);

    }
}
