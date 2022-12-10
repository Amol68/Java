import java.io.*;

public class data
{
 public static void main(String[] args) throws IOException , FileNotFoundException
 {
    FileOutputStream fout = new FileOutputStream("write.txt");
    DataOutputStream dout = new DataOutputStream(fout);
    dout.writeInt(6);
    fout.close();
    dout.close();

   FileInputStream fin = new FileInputStream("write.txt");
    DataInputStream din = new DataInputStream(fin);
    int data = din.readInt();
    System.out.println("Data:" +data);
    fin.close();
    din.close();
  

 }

}
