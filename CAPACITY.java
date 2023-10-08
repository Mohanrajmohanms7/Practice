
import java.util.*;

public class CAPACITY {
    public static void main(String []arg)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=in.nextLine();
         
        StringBuilder dis= new StringBuilder(name);
        int c=dis.capacity();
        System.out.println(c);
    }
    
}
