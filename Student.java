//  ->> The this keyword can be used to refer current class instance variable. 
 //       If there is ambiguity between the instance variables and parameters, this 
  //     keyword resolves the problem of ambiguity.


class Student {
    
    private int roll;
    private String name;
    
     Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }
    
    public void display(){
        System.out.println("Roll No:" +roll + " Name:" +name);
    }
    public static void main(String[] args) {
       
       Student s1 = new Student(1,"Om");
       s1.display();
    }
}

----->----->----->----->----->----->----->----->----->----->----->


// -> The 'this() constructor call 'can be used to invoke the current class constructor. 
  //    It is used to reuse the constructor. In  other words, it is used for constructor chaining.

class A
 {  
   A()
   {
       System.out.println("hello a");
       
   } 
   
  A(int x){  
  this();  
  System.out.println(x);  
   }  
  }  
   
class TestThis5
 {  
  public static void main(String args[]){  
  A a=new A(10);  
  }
     
 }  
