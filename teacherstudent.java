package mohan;

import mohan.student;

class teacher extends student
{
    String fname;
    String mname;
  teacher(String fname,String mname)

 {
    super("mohanraj","salem",20);
    this.fname=fname;
    this.mname=mname;
    this.displayname();
 } 
     void displayname()
     {
        System.out.println("fname="+fname);
        System.out.println("mname="+mname);
     }  
}



public class teacherstudent {
    public static void main(String []arg)
    {
        teacher obj=new teacher("murugaraj","angammal");
      }
    
}
