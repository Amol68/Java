import java.io.*;

public class copy 
{
 public static void main(String[] args) throws IOException , FileNotFoundException
 {
    FileInputStream fis = new FileInputStream("abc.txt");
    FileOutputStream fos = new FileOutputStream("bbc.txt");
    int data;

    while((data=fis.read())!=-1)
     {
         fos.write(data);
     }

  fis.close();
  fos.close();






 }
}