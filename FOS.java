import java.io.*;

public class FOS  {
	
	public static void main(String[] args) throws IOException , FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		fos.write(5);
		System.out.println("Done");
		fos.close();
	}

	
}
