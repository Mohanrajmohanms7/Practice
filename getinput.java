import java.io.*;
                                                           // get input form  user and i use assignment operator
class get
{    
    int x;
    int y;
     DataInputStream in=new DataInputStream(System.in);

   get()
   {
    try{
      System.out.println("enter value of a:");
      x=Integer.valueOf(in.readLine()).intValue();

      System.out.println("enter value of b :");
      y=Integer.valueOf(in.readLine()).intValue();
       } 
   catch(Exception s)
      {

       }

      
}
       void display()
       {
    
           
       System.out.println(x>y);
       System.out.println(x>=y);
       System.out.println(x<y);
       System.out.println(x<=y);
       System.out.println(x==y);
       System.out.println(x!=y); 
       }

}

class getinput  
{
  public static void main(String [] arg)

  {
      get g1=new get();
      g1.display();
  }
    
}
