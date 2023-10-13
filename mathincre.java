import java.util.Scanner;
class increment
{    
    Scanner in =new Scanner(System.in);
    increment()
    {
       System.out.println("Enter the number:");
       int num=in.nextInt();

       System.out.println("increment number:"+Math.incrementExact(num));

    }
}
class mathincre{
public static void main(String ard[])
{
       increment obj=new increment();
}
}

