import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor
{
    
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter 0 for rock , 1 for paper , 2 for scissor:");
    int user_input = sc.nextInt();
    
    Random random = new Random();
    int device_input = random.nextInt(3);
    
    if(user_input == device_input)
    {
        System.out.println("Draw");
    }
    
    else if(user_input==1 && device_input==0 || user_input==2 && device_input==1 || user_input==0 && device_input==2)
    {
          System.out.println("You Win");
    }
    
    else 
    {
            System.out.println("Computer Win");
    }
    
	}
}
