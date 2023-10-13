import java.util.Scanner;
import java.lang.Math;

public class math3
{
     public static void main(String []ms)
     {
        Scanner in =new Scanner(System.in);

         System.out.println("Enter maths mark=");
        int M=in.nextInt();

         System.out.println("Enter Science mark=");
        int S=in.nextInt();

          System.out.println("max mark in tamil and engalish="+Math.min(S, M));

        
        




     }  
}
