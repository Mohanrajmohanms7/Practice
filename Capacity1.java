import java.lang.*;
public class Capacity1 
{
    public static void main(String [] ard)
    {
        StringBuilder C=new StringBuilder();
        C.append("mohanraj");
        C.capacity();
        C.append("tekfilo innovation private limite");
        C.ensureCapacity(35);


        System.out.println(C.capacity());
         System.out.println(C.length());
    }
}
