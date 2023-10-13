import java.util.Scanner;       // math round
public class mathsq3 
{
     public static void main(String [] aed)
     {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the float number:");
        float v=in.nextFloat();
         
        
        System.out.println("Enter the double number:");
        double v1=in.nextFloat();
         
        System.out.println("round value oh float="+Math.round(v));

        System.out.println("round value oh double="+Math.round(v1));


     }
}
