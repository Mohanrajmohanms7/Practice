import java.util.*;
class INSERT
{
    StringBuilder ins=new StringBuilder("welcome" +""+"programing");
    INSERT()
    {
      ins.insert(7,"java");
      System.out.println(ins);
    }
}

class Append
{
   Append()
   {
    
       StringBuilder con=new StringBuilder("welcome ");
        con.append("to mohanraj");
         System.out.println(con);
   }
}

class REPLACE
{
    REPLACE()
    {
        
       StringBuilder con=new StringBuilder("welcome ");
        con.replace(0,3,"mohan");
         System.out.println(con);

    }

}

   class DELETE
   {
    DELETE()
    {
          StringBuilder con=new StringBuilder("mohanraj");
        con.delete(5,8);
         System.out.println(con);

    }
   }
   class  REVERSE
   {
    REVERSE()
    {
       StringBuilder con=new StringBuilder("mohanraj");
        con.reverse();
         System.out.println(con);
    }
   }
public class BUILDER {
        public static void main(String asd[])
    {
        Append obj=new Append();
        INSERT obj1=new INSERT();
       REPLACE obj2=new REPLACE();
       DELETE obj3=new DELETE();
        REVERSE obj4=new  REVERSE();
      
    }
    
}
