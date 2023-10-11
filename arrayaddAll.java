import java.util.ArrayDeque;  
import java.util.Deque;  
public class arrayaddAll {  
    public static void main(String[] args) {  
    Deque<Integer> deque1 = new ArrayDeque<Integer>();  
    System.out.println("The marks for student1 : ");  
    deque1.add(28);  
    deque1.add(25);  
    deque1.add(26);  
   for (Integer integer : deque1) {  
    System.out.println(integer);  
    }  
   Deque<Integer> deque2 = new ArrayDeque<Integer>();  
    System.out.println("The marks for student2 : ");  
    deque2.add(22);  
    deque2.add(19);  
    deque2.add(20);  
  for (Integer integer : deque2) {  
    System.out.println(integer);  
     }  
    deque1.addAll(deque2);  
    System.out.println("The total list for the marks : ");  
     for (Integer integer : deque1 ) {  
        System.out.println(integer);  
    }  
   }  
}  