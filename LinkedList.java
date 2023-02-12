
public class Main
{
    private static list_node head;
    
    private static class list_node{
        
        private int data;
        private list_node next;
        
       public  list_node(int data)
        {
            this.data = data;
            this.next = null;
        }
        
        }
        
         public void show()
        {
            list_node current = head;
            
            while(current!=null)
            {
                System.out.print(current.data + "---->");
                current = current.next;
            }
            System.out.print("null");
        }
        
        
         public int count()
         {
             list_node current = head;
             int count = 0;
             
             while(current != null)
             {
                 count++;
                 current = current.next;
             }
             return count;
         }
         
         public void insert(int data)
         {
             list_node newNode = new list_node(data);
             newNode.next = head;
             head = newNode;
         }
            
    
    
	public static void main(String[] args) {
		
		Main m1 = new Main();
	m1.head = new list_node(10);
		list_node second = new list_node(1);
		list_node third = new list_node(8);
	    list_node fourth = new list_node(7);
	    
	    m1.head.next = second;
	    second.next = third;
	    third.next = fourth;
	    
	   m1.show();
	   System.out.println("\n" +m1.count());
	   
	   
	   m1.insert(88);
	   m1.show();
	   
	    
	}
}
