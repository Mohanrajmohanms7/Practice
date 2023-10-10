import java.util.*;
public class arraylist2 
{
   public static void main(String [] ard)
   {
    ArrayList  li=new ArrayList();

    li.add("mohanraj");
    li.add("hari");
    li.add("praveen");
    li.add("suraj");
    li.add("dinesh");
    li.add("saravanan");
    
    li.set(0,"tekfilo");
    li.set(1,"innovation");
    li.set(2,"private");
    li.set(3,"limit");
     
    System.out.println(li);
    System.out.println(li.get(0));
     System.out.println(li.size());
   } 
}
