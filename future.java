
class past 
{
   void show_past_info()
   {
     String name = "Balasaheb Thackaray";
     String role = "Founder Of ShivSena";

     System.out.println("Name:" +name);
     System.out.println("Post:" +role+ "\n");
     
   }
} 


class present extends past
{
   void show_present_info()
   {
     String name = "Uddhav Thackaray";
     String role = "Member Of MLC";

     System.out.println("Name:" +name);
     System.out.println("Post:" +role+ "\n");
     
   }
} 


class future extends present
{
    void show_future_info()
    {
      String name = "Aditya Thackaray";
      String role = "MLA Of Worli";
 
      System.out.println("Name:" +name);
      System.out.println("Post:" +role+ "\n");
      
    }

    public static void main(String[] args)
    {
       future f1 = new future();
       f1.show_future_info();
       f1.show_present_info();
       f1.show_past_info();
       
    }
}
