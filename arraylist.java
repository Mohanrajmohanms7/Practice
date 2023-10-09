 import java.util.*;
public class arraylist{                        // array list
  public static void main(String[] args) { 
  
    
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("raj");
    cars.add("su");
    cars.add("dinesh");
    cars.add("hari");

    cars.add(0,"mohan");

    cars.set(1,"suraj");

    cars.remove(0);

    cars.add(4,"saravanan");

    System.out.println(cars.get(0));

   
    System.out.println(cars);

    System.out.println(cars.size());

    Collections.sort(cars);

    

    System.out.println();
  } 
}
