 abstract class  solution               /* In this class I use 6 concepts 
                                           this key,super key,abstract  
                                            overloading,override,inheritance  */
{
    void display( int x,int y )
    {    
        // int x=80;
       // int y=40;
         System.out.println(x+y); 

          System.out.println("void display");
    }
    void display1()
    {
        this.display(80,40);                              //thiskey
         System.out.println("abstract class base class");
        
    }
   abstract void display2();                                  // abstract
}

class solution1 extends solution                              // inheritance
{    @override
    void display2()   //override
    {        
            super.display1();                                 // super key
             
           System.out.println("derived class");
           this.display2(20);                              // this key
    }

    void display2(int age) //overloding
    {
              System.out.println(age);
    }
}

class allinone
{
    public static void main(String [] arg)
    {
         solution1 obj=new solution1();
         obj.display2();
    }
}
