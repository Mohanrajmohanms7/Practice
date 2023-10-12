
import java.util.*;

class student
{
    String name,city;
    int age;
    ArrayList a1=new ArrayList();
    student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;

        a1.add(this.name);
        a1.add(this.age);
        a1.add(this.city);

     
        
    }

    public void display()
    {
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
   
}

class stringbuffer
{
    public static void main(String []aa)
    {
        student  obj=new student("mohanraj", 21, "tharamangalam");
        obj.display();
       
        ArrayList  <String> m1=new ArrayList  <String>();
        
        m1.add("suraj");
         m1.add("praveen");
          m1.add("hari");
           m1.add("mohan");
            m1.add("dinesh");
             m1.add("saravanan");

        for(String w:m1)
        {
            System.out.println(w);
        }
      
    
    }
}
