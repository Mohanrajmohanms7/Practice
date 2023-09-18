
class demo1
{
    demo1(int args )
    {
       int a=args;
        System.out.println("welcome to constracter"); // same name of the method is call constructer
         System.out.println(a);
    }

    void display() 
    {
       System.out.println("method overloading"); // method name are same but differ in parameter so this is called method overloading
    }

    void display(int number) 
    {
        System.out.println("number="+number);
    }

    void display( String name,float decimal) 
    {
        System.out.println("name:"+name);
        System.out.println("decimal="+decimal);
    }

    

}

class demo2
{
String f;
String l;

demo2(String firstname,String lastname)
{
f=firstname;
l=lastname;
} 
void name( String firstname,String lastname)
{
    this.f=firstname;
    this.l=lastname;                  // this key word call the corrent object
       System.out.println(firstname);
          System.out.println(lastname);
            

}



}

class demo{
    public static void main( String args[]){

        System.out.println("welcome to java");
        demo1 value=new demo1(10);
        System.out.println();
        value.display("tekfilo",5.5f);// argument only call the method
        value.display();
        value.display(10000);
        value.display("arun", 100f);

        demo2 value2=new demo2("MOHAN", "RAJ");
        value2.name("mohan","raj");
        
    }
}