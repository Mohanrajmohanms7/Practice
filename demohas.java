class actor
{
    String aname,acity;
    int aage,anumber;

    actor(String aname, String acity,int aage, int anumber)
    {
      this.aname=aname;
      this.acity=acity;
      this.aage=aage;
      this.anumber=anumber;
    }
}

class fans
{
    String name,city;
    int age;
    actor has;

    fans( String name,String city,int age,actor has)
    {
       this.name=name;
       this.city=city;
       this.age=age;
       this.has=has;
       

    }
    void display()
    {
        System.out.println("fans name="+name);
        System.out.println("fans city="+city);
        System.out.println("fan age="+age);
        System.out.println("aname="+has.aname);
        System.out.println("acity="+has.acity);
        System.out.println("aage="+has.aage);
        System.out.println("anumber="+has.anumber);
    }

}
class demohas{
    public static void main(String ard[]){
          actor a1=new actor("vijay","tharamagalam",20, 100);
          actor a2=new actor("ajith","channei",24,1001);
   
          fans f1=new fans("hari","salem",50,a1);
          
          fans f2=new fans("mohan","salem",50,a2);
          f2.display();
          f1.display();

    }
}