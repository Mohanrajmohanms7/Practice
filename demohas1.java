class in1
{
    String name;
    String age;
    in1( String name,String age)
    {
         this.name=name;
         this.age=age;
    }
}
class in2
{    
    int pincord;
    int pnumber;
    in1 con;

    in2( int pincord,int pnumber,in1 con)
    {
        this.pincord=pincord;
        this.pnumber=pnumber;
        this.con=con;
        this.display();
    }

    void display()
    {
        System.out.println("pincord="+pincord);
        System.out.println("pnumber="+pnumber);
        System.out.println("name="+con.name);
        System.out.println("age="+con.age);
        
    }
}

class demohas1
{
      public static void main (String arg[])
      {
          in1 obj=new in1("mohanraj","twenty year old");
          in2 ob=new in2(556677,97436,obj);
      }
}