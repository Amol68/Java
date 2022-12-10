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

***********************//**********************//**********************//**********************//**********************//**********************//
 
 
 import java.io.*;

public class write2file
{
  public static void main(String[] args) throws IOException
  {
    FileOutputStream fout = new   FileOutputStream("dump.txt");
    DataOutputStream dout = new   DataOutputStream (fout);

    int a = 5;
    boolean b = true;
    float x=1.1f;

    dout.writeInt(a);
    dout.writeBoolean(b);
    dout.writeFloat(x);

   fout.close();
   dout.close();

   FileInputStream fin = new   FileInputStream("dump.txt");
    DataInputStream din = new   DataInputStream (fin);

    System.out.println("Integer:" +din.readInt());
    System.out.println("Float:" +din.readFloat());
  
    System.out.println("Boolean:" +din.readBoolean());
    fin.close();
   din.close();

 
  }

}
 
 
 
 
 
 
