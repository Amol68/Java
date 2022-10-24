// The finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.

public class Main
{
    public static  int operation()
    {
        try{
        int a = 60;
        int b = 0;
        int c = a/b;
        return c; // the c value will be returned  afer the execution of finally block
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        finally
        {
            System.out.println("Program Terminated"); // after execution of Finally , C will be returened. 
        }
        
        
        return -1;
    }
    
	public static void main(String[] args) 
	{
	    int ans = operation();
	    System.out.println(ans);
	}
}
