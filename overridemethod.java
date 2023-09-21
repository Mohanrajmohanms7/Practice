class Tekfilo
{    int a=19;
    void getmohan()     //method overriding
    {
            System.out.println("this is super class");
            System.out.println(a);
    }
}
class Tekfilo1 extends Tekfilo
{     
     int a=15;
    void getmohan()        //method overriding
    {
         System.out.println("this is derived class");
          System.out.println(a);
    }
}

class overridemethod{
    public static void main( String ard[])
    { 
        Tekfilo1 obj=new Tekfilo1();
        obj.getmohan();
        
         Tekfilo obj1=new Tekfilo();
        obj1.getmohan();
    }
}