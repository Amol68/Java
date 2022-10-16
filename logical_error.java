
public class Main
{
	public static void main(String[] args) 
    {
        for(int i=1; i<=4; i++)
        {
            System.out.println(2*i+1);
        }
        
	}
}

/*Output Contains 9 which is not a prime number. It is a logical error.

  1. A logic error is when your program compiles and executes, but does the 
  wrong thing or returns an incorrect result or no output when it should 
  be returning an output. 
  
  2. These errors are detected neither by the compiler nor by JVM. 
  The Java system has no idea what your program is supposed to do, so it provides no 
  additional information to help you find the error.
  
  3.Logical errors are also called Semantic Errors. These errors are caused due to an incorrect 
  idea or concept used by a programmer while coding. 
  
  4.Syntax errors are grammatical errors whereas, logical errors
  are errors arising out of an incorrect meaning. 
  
  5.For example, if a programmer accidentally 
  adds two variables when he or she meant to divide them, the program will give no error and
  will execute successfully but with an incorrect result. 
  
 Example: Accidentally using an incorrect operator on the variables to perform an operation 
 (Using ‘/’ operator to get the modulus instead using ‘%’) */
