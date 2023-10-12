 class TEST
{    static String f ="mohan";
     static String l="raj";
    TEST()
    {
       System.out.println("Static method");
    }

    void mohan()
    {
       System.out.println(f+l);
       
    }
}



public class staticv
{
    public static void main(String [] qwe )
    {
        new TEST().mohan();
    } 
}
