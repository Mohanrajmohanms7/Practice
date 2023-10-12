import java.util.*;
public class VECTORS{
  public static void main(String args[]){
	Vector<String> vector = new Vector<String>();
     
	vector.add("mohanraj");
	vector.add("praveen");
	vector.add("suraj");
	vector.add("hari");
        System.out.println(vector);
        
        vector.add(2,"dinesh");
        System.out.println(vector);
        
        System.out.println("Element at index 2 is: "+vector.get(2));
        
        System.out.println("The first element of this vector is: "+vector.firstElement());
        
        System.out.println("The last element of this vector is: "+vector.lastElement());
       
        System.out.println("Is this vector empty: "+vector.isEmpty());
  }
}
