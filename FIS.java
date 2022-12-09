package java_io;
import java.io.*;

public class FIS {

	public static void main(String[] args) throws IOException , FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("demotxt.txt");
		int data1 = fis.read();
		int data2 = fis.read();
		int data3 = fis.read();
		System.out.println("Data: "+(char)data1);
		System.out.println("Data: "+(char)data2);
		System.out.println("Data: "+data3);
		fis.close();
		
	}
}
