class grandfather
{
     String name,city;
     int age;
     grandfather()
     {
        name="aarunachalam";
        city="tharamangalam";
        age=85;
        this.displaygrandfather();
     }

     void displaygrandfather()
     {  
        System.out.println("grandfather name="+name);
        System.out.println("grandfather city="+city);
        System.out.println("grandfather age="+age);
        
     }
}
class father extends grandfather
{
    father()
    {
        super();
        name="murugaraj";
        city="tharamangalam";
        age=55;
        this.displayfather();
    }
    void displayfather()
    {
    
        System.out.println("father name="+name);
        System.out.println("father city="+city);
        System.out.println("father age="+age);
    }
}
class son extends father
{
    son()
    {
        super();
        name="mohanraj";
        city="tharamangalam";
        age=20;
        this.displayson();
    }

    void displayson()
    {
        System.out.println("son name="+name);
        System.out.println("son city="+city);
        System.out.println("son age="+age);
    }
}

class thiskeyandsuperkeyandinheri
{
    public static void main(String arg[])
    {
        son detail= new son();
        
    }
}
