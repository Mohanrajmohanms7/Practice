class mohan
{
    int age;
    String city,name;    // global variable or instance

    mohan(int age,
    String city, String name)
    {
     this.age=20;
      this.city="salem";
       this.name="MOHANRAJ";
    }

    void display( )
    {
       System.out.println("age="+age);
       System.out.println("name="+name);
       System.out.println("city="+city);
    }
}

class raj
{
    String tname="navanidhan";
    int tage=40;                // instance variable

     void displayname()
     {
         System.out.println("displayname "+tname);
     }

     void displayage()
     {
        System.out.println("displayage "+tage);
     }
}

class instancevariable
{
    public static void main(String []arg)
    {
        mohan obj=new mohan(20,"salem","tharamgalam");
        obj.display();

        raj obj1=new raj();
        obj1.displayname();
        obj1.displayage();
    }
}