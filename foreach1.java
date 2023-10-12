
import java.util.*;

public class foreach1 {
    public static void main(String [] ms)
    {
        ArrayList  <String> ex=new  ArrayList();
        
        ex.add("tekfilo,");
        ex.add("innovation,");
        ex.add("private,");
        ex.add("limit");

        System.out.println("before        :"+ex);

          
         System.out.println("for each......");     

        for(String s: ex)
        {
            System.out.println(s);
        }

        Iterator it=ex.iterator();
         System.out.println("while......");   
       while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

