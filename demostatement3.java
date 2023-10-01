import java.util.Scanner;

class rulestha
{
    Scanner get=new Scanner(System.in);

    rulestha()
    {
        System.out.println("Enter a number"); 
        int num=get.nextInt();
        if(num<0)
        {
            System.out.println("number is nagative");
        }
        else{
            System.out.println("number is pasitive");
        }
    }
}

class demostatement3 {
    public static void main(String arg[])
    {
        rulestha o=new rulestha();
    }
}
