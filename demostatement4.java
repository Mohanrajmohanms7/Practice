import java.util.Scanner;

class percentage
{    
    
    Scanner p=new Scanner(System.in);
    percentage()
    {
      System.out.println("Enter your attenance percentage:");
      float per=p.nextFloat();
       System.out.println("Enter your internal mark:");
      float internal=p.nextFloat();
      System.out.println("your attenance percentage"+per+"%");
      System.out.println("Enter your internal mark:"+internal+"internal mark");
      if(per>75)
      {

        if(20<internal)
        {
        System.out.println("you are eligiable to sem exam");
        }

        else
        {
         System.out.println("internal mark below 20 so not eligiable sem exam");
        }
      }
      else
      {
       System.out.println("you are not eligiable to sem exam");
      }

    }
}

class demostatement4 
{
      public static void main(String ard[])
      {
        percentage mark=new percentage();
      }  
}
