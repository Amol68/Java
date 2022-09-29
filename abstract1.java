
abstract class player
{
    abstract void role();

}

class messi extends player
{
    void role()
    {
        System.out.println("False 9");
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	  messi m1 = new messi();
	  m1.role();
	}
}
