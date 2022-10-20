public class Main
{
	public static void main(String[] args) 
	{
	    int x=5;
	    int y=9;
	    int z=2; 
	    
	   int bigdaddy = (x>y) ? (x>z?x:z) : (y>z?y:z);
	   
	   System.out.println("Largest Number " +bigdaddy);
	 
	}
}

/* First, it checks the expression (x > y). If it returns true the expression (x > z ? x : z) gets executed, else the expression (y > z ? y : z) gets executed.
When the expression (x > z ? x : z) gets executed, it further checks the condition x > z. If the condition returns true the value of x is returned,
else the value of z is returned.
  
When the expression (y > z ? y : z) gets executed it further checks the condition y > z. If the condition returns true the value of y is returned, 
else the value of z is returned.
Therefore, we get the largest of three numbers using the ternary operator.
/*
