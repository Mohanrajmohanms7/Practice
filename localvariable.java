class mohan1
{
         

    mohan1(int age,String city, String name)            // local variable
    {
     // age=20;
     // city="salem";
     // name="MOHANRAJ";

      System.out.println("age="+age);
       System.out.println("name="+name);
       System.out.println("city="+city);
    }

   
}

class raj1
{
    

     void displayage(String tname,int tage)                   // local variable
     {
        System.out.println("displaytname "+tname);
        System.out.println("displayage "+tage);
     }
}

class localvariable
{
    public static void main(String []arg)
    {
        mohan1 obj=new mohan1(20,"salem","MOHANRAJ");


        raj1 obj1= new raj1();
        obj1.displayage("navanidhan",40);
    }
}