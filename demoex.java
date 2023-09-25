interface demo                         /*  in this class i use  5 concept 
                                           interface,inheritance,overriding
                                            thiskey,superkey       */
{                                           
    public void getname();
}

interface demo1 extends demo              
{
    public void getname1();
}
  
  class a

{   
    {
        this.display();
    }
    a()
    {
         System.out.println("constructor class");
    }
   void display()
   {
       System.out.println("base class");
   }
   
}

class b extends a implements demo1
{
    {
         
         this.display1();
         this.getname();
         this.getname1();
    }
    b(){

         int a=10;
         System.out.println(a+=20);
    }
    void display1()
   {
       System.out.println("derived class");

   }
   public void getname()
   {
      System.out.println("interface void getname  are overriding");   
   }
   public void getname1()
   {
       System.out.println("interface void getname1  are overriding");
   }
}

class demoex
{
    public static void main(String []ard)
    {
        b b1=new b();
    }
}
