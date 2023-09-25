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
          this.getname();  
        
    }
  void getname()
    {
          System.out.println("mohanraj");
    }
   abstract void display2();                                  // abstract
}

class solution1 extends solution                              // inheritance
{    
    void display2()   //overloading
    {        
            super.display1();                                 // super key
             
           System.out.println("derived class");
           this.display2(20); 
           this.getname();                                   // this key
    }

    void display2(int age) //overloding
    {
              System.out.println(age);
    }
 
  void getname()
    {
          System.out.println("dineshkumar");
    }
}

class solution2  extends solution1
{     
     
    void getname()
    {
              System.out.println("mohanraj");
    }
}


class allinone
{
    public static void main(String [] arg)
    {
         solution1 obj=new solution1();
         obj.display2();

         solution2 obj1=new solution2(); 
         obj1.getname();
    }
}
