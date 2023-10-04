 import java.util.Scanner;   
    
class loop
{
    Scanner in=new Scanner(System.in);
    loop()
    {   
       System.out.println("enter the number"); 
       int value=in.nextInt();
       while(value<=5)
       {
             System.out.println("this is while loop");
             value++;
       }
        
       do
       {
          System.out.println("this is do while loop");
           value++;  
       }while(value<=8);

       
       for(int i; value<10; value++)
       {
           System.out.println("this is for loop");
         
       }  
    } 
    


}



public class demoloop1 {
    public static void main(String[] arg)
    {
        loop  v=new loop();
    }
    
}
