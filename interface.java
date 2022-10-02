interface bicycle
{
    int a = 45;  //you can create properties in interfaces but cannot modify them as they are final..
    
  void apply_brake(int decrement);
  void speed_up(int increment);

}

interface horn 
{
   // int a = 45;
  void horn1();
  void horn2();
}

class firefox implements bicycle , horn // a class can inherit multiple interfaces at a time unlike abstract classes
{
    public void blow_horn()
    {
        System.out.println("Horn Blown");
    }
    
     public void apply_brake(int decrement)
    {
        System.out.println("Brakes Are Applied");
    }  
    
     public void speed_up(int increment)
    {
        System.out.println("Gears Are Applied");
    }  
    
    public void horn1()
    {
        System.out.println("Horn1 Blown");
    }
    
     void horn2()
    {
        System.out.println("Horn2 Blown");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
    
    // You cannot instantiate an interface just like an abstract method
    
	    firefox f1 = new firefox();
	    
	    f1.apply_brake(2);
	    System.out.println(f1.a);
	    
	    f1.horn1();
	    f1.horn2();
	}
}
