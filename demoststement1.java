import java.io.*;

class marksheet1
{
    
    
    DataInputStream in=new DataInputStream(System.in);
    marksheet1()
    {
        try{

                 System.out.println("Enter your mark:");
                 int mark=Integer.parseInt(in.readLine());
                
                  if((40<mark)&&(60>mark))
                  {
                       System.out.println("C grade");
                  } 
                  
                  else if((70<mark)&&(80>mark))
                  {
                    System.out.println("B grade");
                  }
                   else if((85<mark)&&(100>mark))
                  {
                    System.out.println("A grade");
                  }    

                else
                {
                     System.out.println("you are fail so not eligiable to grade");
                }
             
            }catch(Exception s)
            {

            }
                     
                     
             }
}
class demostatement1
{
    public static void main(String[]arg)
    {
        marksheet1 obj=new marksheet1();
        
    }
}