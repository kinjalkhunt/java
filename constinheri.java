//constructor use by inheritance and use the super key word 
//(use of super key)The super keyword refers to superclass (parent) objects. 
//It is used to call superclass methods, and to access the 
//superclass constructor. The most common use of the super 
//keyword is to eliminate the confusion between superclasses and 
//subclasses that have methods with the same name.
import java.util.*;

class A extends object{
    Scanner sc=new Scanner(System.in);
   public  A(){
        
        System.out.println("hey this is inheritance of constructor");
        //System.out.println("this is variable of b=>");
       // a=sc.nextInt();
       // b=sc.nextInt();
    }
    public void print(){

    
        System.out.println("this is class from print A");
        
    }
}
    
class B extends A{
     public B() {
        
       super.print();
       this.print();
       System.out.println("this is class from B");
    }
    public void print(){
        
    
        System.out.println("this is print B");
        
    }

}
public class constinheri {
    public static void main(String[] args) {
        
        B bb=new B();

        bb.print();
    }
    
}
