
abstract class parent  //abstract class defined
{
    public parent()
    {
        System.out.println("Parent Class Constructor");
    }
    
    public void sayhello()
    {
            System.out.println("Hello");
    }
    
    abstract public void greet(); //abstract method
}

class child extends parent  // inheriting abstract class to use abstract method 
{
    public void greet()
    {
     System.out.println("Greetings");
      
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	  //parent p1 = new parent();  an abstract class cannot be instantiated	
	  child c1 = new child(); // 
	  c1.greet();
	}
}
