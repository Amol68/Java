//  super is used to refer immediate parent class instance variable.
//  We can use super keyword to access the data member or field of parent 
   class. It is used if parent class and child class have same fields.


class Animal{
    
    void name(){
        System.out.println("I Am Animal  ");
    }
}

class Dog extends Animal{
    
     void name(){
        System.out.println("I Am Dog");
        super.name();
    }
     
     }

---------->---------->---------->v-------------------->---------->---------->---------->---------->---------->---------->---------->

  //  super is used to refer immediate parent class instance variable.
//  We can use super keyword to access the data member or field of parent class. 
 //   It is used if parent class and child class have same fields.
  
class Animal{
    
    String color = "Black";
    void name(){
        System.out.println("I Am Animal");
    }
}

class Dog extends Animal{
    
     String color = "Brown";
     
     void display(){
         System.out.println(color  +" ");
         System.out.println(super.color);
     }
     
     
     }
    


class Test{
    
    public static void main(String[] args){
        Dog d=new Dog();  
        d.display();
    }
}
