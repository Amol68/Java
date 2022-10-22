/* When a try catch block is present in another try block then it is called the nested try catch block. 
   Each time a try block does not have a catch handler for a particular exception, then the catch blocks 
   of parent try block are inspected for that exception, if match is found that that catch block executes. */
   
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr [] = new int [3];
	   arr[0]=1;
	   arr[1]=2;
	   arr[2]=3;
	   
	   Scanner sc = new Scanner(System.in);
	   int ind = sc.nextInt();
	   
	   
	    try{
	        
	        try{
	            
	           System.out.println(arr[ind]); 
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	          System.out.println(e);
	          System.out.println("Level 2 Exception");
	        }
	        
	    }
	    catch(ArithmeticException e)
	    {
	        System.out.println(e);
	        System.out.println("Level 1 Exception");
	    }
	}
}
