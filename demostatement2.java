import java.util.Scanner;
public class demostatement2
{
   public static void main(String[] args)
   {
      int num1, num2, largest;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the First Number: ");
      num1 = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      num2 = scan.nextInt();
      if(num1>num2)
         largest = num1;
      else
         largest = num2;
      System.out.println("\nLargest number among two = " +largest);
   }
}