
interface camera {
    
    void take_snap();  // method prototypes
    void record_video();
}

interface wifi
{
    String[] get_network();
    void connect_to_network(String network);
}

class cell_phone
{
    void call_number(int no)
    {
        System.out.println("Calling On: " +no);
    }
    
    void pick_call()
    {
        System.out.println("Calling...");
    }
}

class smart_phone extends cell_phone implements camera , wifi // multiple inheritance achieved through interfaces
{
    public void take_snap()
    {
        System.out.println("Take Snap");
    }
    
   public void record_video()
    {
        System.out.println("Recording Video");
    }
    
     public String[] get_network(){
         
         System.out.println("Getting List Of Networks");
         String[] networklist = {"AB","CD","VC"};
         return networklist;
                 
     }
    
    
    public  void connect_to_network(String network)
     {
         System.out.println("Connecting To " + network);
     }
    
}

public class Main
{
	public static void main(String[] args) {
	    
	    smart_phone p1 = new smart_phone();
	    String[] s1 = p1.get_network();
	    for(String item : s1)
	    {
	        System.out.println(item);
	    }
	}
}
