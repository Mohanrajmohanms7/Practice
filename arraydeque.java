import java.util.*;  
import java.util.Deque;  
public class arraydeque {  
   public static void main(String[] args) {  
      ArrayDeque< String> deque = new ArrayDeque<String>();  
        deque.addLast("Sunday");  
        deque.addLast("Monday");  
        deque.addLast("Tuesday");  
        deque.addLast("Wednesday");  
        deque.addLast("Thursday");  
        deque.addLast("Friday");  
        deque.addLast("Saturday");
        System.out.println(deque);
        
        Iterator I=deque.iterator();
        while(I.hasNext())
        {
   System.out.println("Week : "+I.next());  
        }
   }  
}