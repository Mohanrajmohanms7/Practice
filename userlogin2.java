import java.io.*;

class login
{

  String f,l,g;
  int p;

       DataInputStream  ge=new DataInputStream(System.in);
  login()
  {
    try
    {
              System.out.println("first name:" );
              f=ge.readLine();
              System.out.println("last name:");
              l=ge.readLine();
              System.out.println("Gmail:");
              g=ge.readLine();
              System.out.println("password:");
              p= Integer.parseInt(ge.readLine());
            // System.out.println("TEKFILO COMPANY");
            
             //System.out.println("login successfully");

    }catch(Exception s){}
 
    }
} 

class user extends  login
{
    
      void display()
      {      System.out.println("TEKFILO COMPANY");
             System.out.println("first name:"+f );
             System.out.println("last name:"+l);
             System.out.println("Gmail:"+g+"@gamail.com");
             System.out.println("password:"+p);
             System.out.println("login successfully");
      }
}

class userlogin2
{
  public static void main(String arg[])

  {
     user obj=new user();
     obj.display();

  }
}