import java.util.Scanner;

class percentage1
{    
    
    Scanner p=new Scanner(System.in);
    percentage1()
    {
      System.out.println("Enter your attenance percentage:");
      float per=p.nextFloat();
       
      System.out.println("your attenance percentage"+per+"%");
      
      if(per>75)
      {
        System.out.println("Enter your internal mark:");
      float internal=p.nextFloat();
      System.out.println("Enter your internal mark:"+internal+"internal mark");
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

         System.out.println("you are not eligiable to sem exam .you write exam mean pay 500 ");
          System.out.println("enter yes or no:");
         String a=p.next();
         if(a.equals("yes"))
         {
            System.out.println("you are  eligiable to sem exam");
         }

         else
         {
             System.out.println("you are not eligiable to sem exam");
         }
      }

    }
}

class demostatement7 
{
      public static void main(String ard[])
      {
        percentage mark=new percentage();
      }  
}
