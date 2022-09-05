import java.util.Scanner;

public class one_dim_array {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size:");
        int size=sc.nextInt();
   
        int arr[]=new int[size];

        System.out.println("Enter " +size+ " Values");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Resultant Array:");
      
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
      
        }

        
    }

}

