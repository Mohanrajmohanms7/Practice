class operators
{
    int x=10;
    int y=20;
    operators()
    {
       System.out.println("assignment operators");
       this.getresult();
    }

    void getresult()
    {
        
       System.out.println(x>y);
       System.out.println(x>=y);
       System.out.println(x<y);
       System.out.println(x<=y);
       System.out.println(x==y);
       System.out.println(x!=y);

    }
}
class assignmentop
{
  public static void main(String [] arg)
  {
    operators obj= new operators();
  }
}