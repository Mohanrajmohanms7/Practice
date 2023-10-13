import java.util.Scanner;
 
public class mathsq2{
 
    public static int returnSquare(int num) 
    {
        return num*num;
    }
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
 
        int num = scan.nextInt();
 
        scan.close();
        
        int square = returnSquare(num);
 
        System.out.println("The Square of the number is : " + square);
    }
}