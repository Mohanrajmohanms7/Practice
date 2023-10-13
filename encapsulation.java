
 class student {  
 
private String name;  

public String getName()
     {  
          return name;  
     }  

public void setName(String name)

      {  
        this.name=name ; 
        this.getName();
        System.out.println(name);
      }  
}

  public class encapsulation
  {
    public static void main(String ae[])
    {
        student obj=new student();
        obj.setName("mohan");
        
    }
  }

