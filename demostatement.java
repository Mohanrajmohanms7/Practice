class marksheet
{
    int mark=87;

    marksheet()
    {
        if(mark>=40)
        {
            System.out.println("you pass");
        }
         else
         {
              System.out.println("you fail");
         }

        
    }
         void displaygrade()
            {
                
                
                  if((40<mark)&&(60>mark))
                  {
                       System.out.println("C grade");
                  } 
                  
                  else if((70<mark)&&(80>mark))
                  {
                    System.out.println("B grade");
                  }
                   else if((85<mark)&&(90>mark))
                  {
                    System.out.println("A grade");
                  }    

                else
                {
                     System.out.println("you are fail so not eligiable to grade");
                }
             }
}
class demostatement
{
    public static void main(String[]arg)
    {
        marksheet obj=new marksheet();
        obj.displaygrade();
    }
}