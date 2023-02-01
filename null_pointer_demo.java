class Demo {
    int x = 10;
    
    int display()
    {
        System.out.println("x = " + x);
        return 0;
    }
}
 
class null_pointer_demo {
    public static void main(String[] args)
    {
        Demo D1 = null; // point 1
 
       // System.out.println(D1); // point 2
 
        System.out.println(D1.display()); // point 3
    }
}

// https://www.geeksforgeeks.org/reference-variable-in-java/
