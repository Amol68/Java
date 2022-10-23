//The throws keyword indicates what exception type may be thrown by a method.
//The Java throws keyword is used to declare an exception. It gives an information to the programmer 
//that there may occur an exception so it is better for the programmer to provide the exception handling
//code so that normal flow can be maintained.

public class Main
{
   
    public static int divide(int a , int b) throws ArithmeticException  // function is created
    {
        int result = a/b;
        return result;
    }
    
	public static void main(String[] args) 
	{
	    try{
	        int c = divide(2,1);   // functions is called resulting in error occurence i.e. divide by 0
	        System.out.println(c);
	    }
	    
	    catch(Exception e){
	        
	        System.out.println("Exception Occured");
	    }
	}
	
}

/* >> The @Override annotation denotes that the child class method overrides the base class method.
   >> For two reasons, the @Override annotation is useful.
   >>If the annotated method does not actually override anything, the compiler issues a warning.
   >>It can help to make the source code more readable.
*/
