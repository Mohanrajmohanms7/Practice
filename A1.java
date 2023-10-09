import java.util.*;        
class A
{
   
    Scanner in=new Scanner(System.in);  
     {
        this.display();
    }                  // get input form the user
    A()
    {
       System.out.println("enter your company name:");
       String name=in.next();
       StringBuilder st=new StringBuilder(name);
        st.append("  innovation");                    // append method
       System.out.println("company name:"+st);
    }

    void display()
    {
       
       System.out.println("enter your company id number:");
       int id=in.nextInt();
       StringBuilder ts=new StringBuilder(id);
        ts.append(30);                    // append method
       System.out.println("id num:"+ts); 
    }
}





public class A1 
{
 public static void main(String [] aer)
 {
     A on=new A();
     on.display();
 }   
}
