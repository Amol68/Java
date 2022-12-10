//Serialization in Java is the process of saving an object's state as a sequence of bytes. 

//Deserialization in Java is the process of restoring an object from these bytes. 

import java.io.*;

public class object_demo {

	public static void main(String[] args)
	{
		try {
			student jay = new student("jay",123);
			
			FileOutputStream f1 = new FileOutputStream("obj.txt");
			ObjectOutputStream o1 = new ObjectOutputStream(f1);
			
			o1.writeObject(jay);
			o1.close();

			FileInputStream fin = new FileInputStream("obj.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
                  student s1=null;
                  s1=(student)oin.readObject();
                  System.out.println("Name:"+s1.name+"\n"+"No:"+s1.regno);
                   oin.close();


		}
		catch(Exception e){
			
		}
	}
	
}

  class student implements Serializable{
	  
	 String name;
	 int regno;

	public student(String name, int regno) {
		super();
		this.name = name;
		this.regno = regno;
	}
	 
  
  }