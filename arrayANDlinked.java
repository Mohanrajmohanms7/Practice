
import java.util.*;

public class  arrayANDlinked {
  public static void main(String[] args) {
  
    
    ArrayList li=new ArrayList();
    li.add("tekfilo");
    li.set(0,"hi");
    li.add("tekfilo");
    li.add("innovation");
    li.add("private");
    li.add("limite");

    li.remove(0);
   
     System.out.println("arraylist:"+li);
     
   LinkedList il=new LinkedList();    /
   il.add("mohan");
   il.addFirst("raj");
   il.remove(1);
   il.addLast(5);
   il.set(0,"i am");
   
   il.set(1,"tekfilo innovation private limite");
   
    System.out.println("linkedlist"+il);
   
   
   
  }
}

