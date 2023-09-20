class sample0
 {                                        // inheritance  class sample and class sample1
    String name;
    
    void  getdata()
	{
	  String city="tharamangalam";
	   System.out.println("Name from super class"+city);
	}
 }

class sample1 extends sample0
 {
   void display(String name)
	{
	
      System.out.println("Name="+name);
      this.getdata();                            // and use this key word
	}
 }


class inher
 {
    public static void main(String asd[])
	{
	   sample1 obj=new sample1();
       obj.display("mohan");


	}
 }