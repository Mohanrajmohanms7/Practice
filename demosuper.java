class arun 
{
  arun()
  {
      this.display1();     // this keyword
  }

  void display1()
  {
        System.out.println(" display1");
  }
}

class bala extends arun
{
  bala()
  {
     super();            // super keyword
     this.display2();   // this keyword
  }

  void display2()
  {
    System.out.println(" display 2");
  }
}
class demosuper{
    public static void main( String arg[])
    {
        bala obj=new bala();
    }
}

