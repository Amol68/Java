class emp 
{
    int id;
    int salary;
    static String ceo;  //static variable declared
    
    void show()
    {
        System.out.println(id + ":"+salary + ":" +ceo);
    }
}

public class Main
{
    public static void main(String args[])
    {
        emp om = new emp();
        om.id=01;
        om.salary=3000;
        om.ceo="bill";  
        
        emp jay = new emp();
        jay.id=02;
        jay.salary=5000;
        jay.ceo="ray";  
        
        emp phil = new emp();
        phil.id=03;
        phil.salary=4000;
        phil.ceo="garry";  //the overwritten value will be displayed for 'ceo' in case of all objects.
        
        
        om.show();
        jay.show();
        phil.show();
        
    }
}