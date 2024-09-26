//abstract class of class object

//What is an Abstract Class?
//A class that contains an abstract keyword on the declaration is known as an 
//abstract class. It is necessary for an abstract class to have at least one 
//abstract method. It is possible in an abstract class to contain multiple concrete methods.


import java.util.*;
    abstract class A {
        
        abstract void set();
        static void get(){

            System.out.println("hasta la vista baby...");
        }
    }
     
    // Abstraction performed using extends
    class B extends A {
        public void set()
        {
             System.out.println("hey how r u?....");
        }
    }
     
    // Base class
    class abstractclass {
        public static void main(String args[])
        {
            A s = new B();
            s.set();
            s.get();
        }
    }

   /* abstract class Shape{  
        abstract void draw();  
        }  
        //In real scenario, implementation is provided by others i.e. unknown by end user  
        class Rectangle extends Shape{  
        void draw(){System.out.println("drawing rectangle");}  
        }  
        class Circle1 extends Shape{  
        void draw(){System.out.println("drawing circle");}  
        }  
        //In real scenario, method is called by programmer or user  
        class abstractclass{  
        public static void main(String args[]){  
        Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
        Shape k=new Rectangle();
        s.draw(); 
        //k.draw ();
        }  
        }*/  

    /*class A{
        public void set(){
        System.out.println("hasta la vista baby...");
    }
}

class abstractclass{

    public static void main(String[] args) {
        
        A aa=new A();
        aa.set();
    }
}*/


/*class B{

    public void get(){

        System.out.println("who r u...?");
    }
}*/
    

