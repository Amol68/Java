/* Wrapper Classes in Java
In Java, there are primitive data types like int, float, and char, which are not object types. 
However, Java also provides wrapper classes for these primitive types. These wrapper classes,
also known as vapor classes, allow you to work with the primitive values as objects.

Why Use Wrapper Classes?
While working with frameworks that only support objects, such as the collection framework, you need
to use object types instead of primitive types. Vapor classes provide a way to convert primitive types 
into object types, allowing you to work with them in such frameworks.

Boxing and Unboxing
When you convert a primitive type into its corresponding wrapper class object, it is called boxing. 
For example, converting an int to an Integer object is boxing. On the other hand, when you extract
the primitive value from the wrapper class object, it is called unboxing. For example, extracting an
int value from an Integer object is unboxing.

Auto Boxing and Auto Unboxing
In Java, auto boxing and auto unboxing allow you to perform boxing and unboxing operations automatically 
without explicitly calling the conversion methods. For example, you can directly assign a primitive value
to a wrapper class object, and Java will automatically perform the boxing conversion.

Example
Here is an example of using the Integer wrapper class:
int num = 7;Integer num1 = new Integer(8); // Boxingint num2 = num1.intValue(); // Unboxingint num3 = num1; // Auto Unboxing
In the above example, the variable num is a primitive int type. num1 is an Integer object created using the boxing method.
num2 is assigned the unboxed value from num1 using the intValue() method. num3 is directly assigned the value of num1 using auto unboxing.

Similarly, you can use other wrapper classes like Double and Character for boxing and unboxing operations.
In this example, we want to convert a string into an integer. To do this, we can use the Integer class, which 
has a method called parseInt. This method takes a string as input and converts it into an integer. We can then
store this integer in a variable called num3 and perform calculations on it, such as multiplying it by 2.


These wrapper classes, such as Integer, are called "wrapper" classes because they wrap around primitive types and provide additional features.
One of these features is the parseInt method, which allows us to convert strings into integers. You can explore other wrapper classes and their features as well.
Additionally, if you directly assign a primitive value to an object type, it is called "autoboxing". And when you want to retrieve the value automatically, it is called "autounboxing". */



class HelloWorld {
    public static void main(String[] args) {
       
       Integer num = new Integer(1);
      System.out.println("Value:" +num);
      
      // OR
     
     Integer num1 = 11;
    System.out.println("Value:" +num1); // this is known as auto-boxing , we are storing primitive type into object type
     
      int num2 = num1; 
     System.out.println("Value:" +num2); // this is known as       auto un-boxing , we are storing object type into primitive type
    } 
}


