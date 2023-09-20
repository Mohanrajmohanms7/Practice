class A                     // inheritance concept  and  this key concept
{
     void display()
     {
           System.out.println("display first method");
           //this.display1();     //this key word
     }

     void display1()
     {
            System.out.println(" display method two");
            this.display();          // this key word 
     }

}

class B  extends A
{
    void display2()
     {
             System.out.println("display method three");
             this.display();           //this key word
     }

     void display3()
     {
               System.out.println("display method foure"); 
               //this.display2();           //this key word
     }
}


class inheriandthis
{
   public  static void main(String arg[]){
         B obj= new B();
         obj.display();
        // obj.display1();
         obj.display2();
       
        // obj.display3();
        
   }

}