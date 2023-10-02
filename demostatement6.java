 import java.util.*;
 class interview
{
    Scanner i=new Scanner(System.in);
    interview()
    {
         System.out.println("interview first round mark:");
         int mark=i.nextInt();
       
         

         if(70<mark)
         {
            System.out.println("interview second round mark:");
                    mark=i.nextInt(); 
            if(80<mark)
            {       
                System.out.println("interview third round mark:");
                            mark=i.nextInt();    
                      if(90<mark)
                       {
                           
                         
                           System.out.println("congrats....! your placed this company"); 
                       }
                else
                {
                      System.out.println("your rejected in final round"); 
                }
            }
            else
                {
                      System.out.println("your rejected in second round"); 
                }
         }
               else
                {
                      System.out.println("your rejected in first round"); 
                }
    }

}

public class demostatement6 
{
    public static void main(String ard[])
    {
        System.out.println("Tekfilo company contect three round interview ");
        System.out.println("so the interest student attend three round ");
        System.out.println("you must pass all the three round.otherwise you rejected");
        interview obj=new interview();
    }
}
