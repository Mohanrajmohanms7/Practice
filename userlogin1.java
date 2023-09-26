import java.io.*;          // get input form user
class login1
   {
       DataInputStream con=new DataInputStream(System.in);
       login1()
       {
         System.out.println("enter your mark details");
       }
   }

   class login2 extends login1  // inheritance
   {
       login2( )
       {

        
          try
          {
                     int x=Integer.valueOf(con.readLine()).intValue();
             System.out.println("enter you 10th mark="+ " "+x);
                    int y=Integer.valueOf(con.readLine()).intValue();
             System.out.println("enter you 12th mark=" + " "+y);
                      int  z=Integer.valueOf(con.readLine()).intValue();
             System.out.println("enter you 12th mark="+" "+z);
              System.out.println("successfully enter");
              
               

        
                                                                   
          }
          catch(Exception a)
          {} 
       }
   }

   public class userlogin1{
         public static void main(String []arg)
         {
            login2 on=new login2();
         }
   }