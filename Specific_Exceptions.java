import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
        
        int [] marks = new int[3];
        marks[0]=50;
        marks[1]=40;
        marks[2]=60;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter An Array Index:");
        int ind = sc.nextInt();
        
        System.out.println("Enter A Number:");
        int num = sc.nextInt();
        
        try {
            
            System.out.println("Value at Entered Index:" +marks[ind]);
            System.out.println("Final Result:" +marks[ind]/num);
            } 
            
            catch(ArithmeticException e) // this exception will be thrown first in case both error occurs
            {
              System.out.println("ArithmeticException Occured"); 
              System.out.println(e);
            }
            
            catch(ArrayIndexOutOfBoundsException e)
            {
              System.out.println("ArrayIndexOutOfBoundsException Occured"); 
              System.out.println(e);
            }
            
            catch(Exception e)
            {
                System.out.println("Some Other Exception Occurred");
            }
        
        
        
        
        
	}
}
