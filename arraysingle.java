class single
{                                              // One-dimensional array
    single()
    {
        int mark[]={1,2,3,4,5,6,};
        System.out.println(mark[0]);
         System.out.println(mark[1]);
          System.out.println(mark[2]);
           System.out.println(mark[3]);
            System.out.println(mark[4]);

            this.method();
             
    }

     void method()
     {
       String roll[] = {"mohan","raj"};
       
        System.out.println(roll[0]);
        System.out.println(roll[1]);
        this.method1();
     }

      void method1()
     {
        char roll[] ={'M','O','H','A','N'};
         System.out.println(roll[0]);
        System.out.println(roll[1]);
        System.out.println(roll[2]);
        System.out.println(roll[3]);
        System.out.println(roll[4]);
        
     }
}

public class arraysingle {
    public static void main(String asd[])
    {
         single obj=new single();
    }
    
}
