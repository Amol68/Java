import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	   
    
      try{
      File f1 = new File("1.txt");                  //to create a new file , 'File' class is used
	    f1.createNewFile();
	    }
	    catch(IOException e)
	    {
	     System.out.println("Unable to create a new file");   
	    }                                                   //New File Created
	    
    
    
	    try{
	    FileWriter fw = new FileWriter("1.txt");           // to write to a new file, 'FileWriter' class is used
	    fw.write("Content of created file");
	    fw.close();
	    }
	    catch(IOException e)
	    {
	        System.out.println("Unable to write to a file");
	        
	    }                                     // written to a created file
	    
	    
    
    
	    try{
	        File fr = new File("1.txt");                   //to create a new file , 'File' class is used
	        Scanner sc = new Scanner(fr);
	        
	        while(sc.hasNextLine())
	        {
	            String line = sc.nextLine();
	            System.out.println(line);
	        }
	        sc.close();
	    }
    
	    catch(IOException e)
	    {
	       System.out.println("Unable to read from a new file");  
	       System.out.println(e);
	    }                //read from created file
	    
	   
	  
    
    
	    try{
	        File myFile = new File("1.txt");  // code to delete  a file
	        if(myFile.delete())
	        {
	         System.out.println("File has been successfully deleted");
	        }
	        else
	        {
	            System.out.println("Unable to Delete file");
	        }
	    }                        //to delete a file , 'File' class is used
	   catch(Exception e)
	   {
	       System.out.println("Unsuccessfull Deletion"); 
	        System.out.println(e);
	    }                                        // file has been deleted
	    
	    
	}                                    
	
	
}

// IOException is thrown when an error occurred during an input-output operation.
//That can be reading/writing to a file, a stream (of any type), a network connection, 
//connection with a queue, a database etc, pretty much anything that has to do with data 
//transfer from your software to an external medium.
//In order to fix it, you would want to see the stack trace of your exception or at least 
//the message, to see exactly where the exception is thrown and why.
