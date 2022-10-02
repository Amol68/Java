abstract class shape
{
    abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user 

class rect extends shape
{
    void draw()
    {
        System.out.println("Draw Rect");
    }
}


class sq extends shape
{
    void draw()
    {
        System.out.println("Draw Square");
    }
}

class tri extends shape
{
    void draw()
    {
        System.out.println("Draw Triangle");
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        shape rectangle = new rect();
        rectangle.draw();
        
        shape square = new sq();
        square.draw();
        
        shape triangle = new tri ();
        triangle.draw();
    }
}


////Example of an abstract class that has abstract and non-abstract methods:

abstract class bike
{
    bike()
    {
        System.out.println("This is bike  constructor");
    }
    
    abstract void run();
    
    void change_gear()
    {
            System.out.println("Change The Gear");
    }
    
}

class honda extends bike
{
    void run()
    {
        System.out.println("Honda Is Running");
    }
}

public class Main
{
    public static void main (String[] args) 
    {
        honda h1 = new honda();
        h1.run();
        h1.change_gear();
    }
    

