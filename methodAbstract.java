abstract class shape                  // abstract method
{
    abstract void methodarea();
}

class square extends shape
{
    void methodarea()
    {
          System.out.println("square shape");
    }
}

class triangle extends square
{
    void methodarea()
    {
        super.methodarea();                        //super key                        
         System.out.println("triangle shape");
    }
}

class methodAbstract{
    public static void main(String [] at)
    {
        triangle t1= new triangle();
        t1. methodarea();

       // square s1=new square();
       // s1. methodarea();
    }
}