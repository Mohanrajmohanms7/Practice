
import java.util.Scanner;
class decrement
{    
    Scanner in =new Scanner(System.in);
    decrement()
    {
       System.out.println("Enter the number:");
       int num=in.nextInt();

       System.out.println("decrement number:"+Math.decrementExact(num));

    }
}
class mathdecre{
public static void main(String ard[])
{
       decrement obj=new decrement();
}
}
