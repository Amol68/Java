

public class Main
{
	public static void main(String[] args) 
	{
	    int a = 10;
	    int b = 5;
	    
	    while(true)  // while block keeps executing until b = 1; 
	                //  when b becomes 0 , Exception is occured and finally block is exceuted 
	    {  
	        try{
	         
	         System.out.println("Quotient:" +a/b);
	            
	        }
	        catch(Exception e){
	            System.out.println(e);
	            break;
	        }
	        finally{
	            System.out.println("finally Done For b: " +b+ "\n");
	        }
	        b--;
	     }
	}
}


