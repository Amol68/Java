public class Main
{
    
    
    public static void get_age(int a) throws ArithmeticException
    {
        if(a<18)
        {
            throw new ArithmeticException();
        }
       else 
     {
         System.out.println("Access Granted");
     }
     
    }
    
    public static void main (String[] args) 
    {
      try{
          get_age(13);  
      }
      catch(Exception e)
      {
          System.out.println("Not Eligible");
      }
        
    }
}
