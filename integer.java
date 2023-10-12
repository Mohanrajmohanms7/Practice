import java.util.*;
public class integer 
{
   public static void main(String []a)
   {
       LinkedList <Integer> list=new LinkedList<>();
       list.addFirst(90);
       list.addFirst(80);
       list.addFirst(70);
       list.addFirst(60);
       list.addFirst(50);
       System.out.println("student mark="+list);
       
       for(int m:list)
       {
         System.out.println("MARK="+m);
       }
   } 
}
