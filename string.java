
import java.util.*;
public class string 
{
   public static void main(String []a)
   {
       LinkedList <String> list=new LinkedList<>();
       list.addFirst("M");
       list.addFirst("O");
       list.addFirst("H");
       list.addFirst("A");
       list.addFirst("N");
       System.out.println("name="+list);
       
       for(String m:list)
       {
         System.out.println("letter="+m);
       }
   } 
}

