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

