class tcs
{
  {
    this.name();        // thiskey
  }
  tcs(int a,int b)
  { 
    
    System.out.println(a+b);

    System.out.println("base class");

  }
  void name()
  {
    System.out.println("hrithik");
  }
}
class tek extends tcs   //inheritance
{
   {
    
    this.name1();                   //thiskey
   }
   tek()
   {
        super(10,20);           // superkey
       System.out.println("sub class");    
   }
   void name1()
  {
    System.out.println("mohan");
  }
}

class tekfilo7
{
    public static void main(String [] arg)
    {
        //tcs obj=new tcs();
        tek obj1=new tek();
    } 
}