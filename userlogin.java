import java.io.*;

class login
{
       DataInputStream  ge=new DataInputStream(System.in);
  login()
  {
    try
    {
            
             String f=ge.readLine();
             String l=ge.readLine();
             String g=ge.readLine();
             int p= Integer.parseInt(ge.readLine());
             System.out.println("TEKFILO COMPANY");
             System.out.println("first name:"+f);
             System.out.println("last name:"+l);
             System.out.println("Gmail:"+g);
             System.out.println("password:"+p);
             System.out.println("login successfully");

    }catch(Exception s){}
 
    }
} 

class userlogin
{
  public static void main(String arg[])

  {
     login obj=new login();
  }
}