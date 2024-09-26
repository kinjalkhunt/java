//constructor basic program 
// A FOUR TYPE OF CONSTRUCTOR 1. PRIVATE 2.DEFAULT 3.COPYCONSTRUCTOR 4.parameterrize constructor
//defination::->constructor is a special type of method whose name is same as class name
//the main purpose of constructor is intialize the object
import java.util.*;

//1. default constructor programme
//defination::->a constructor which does not have any parameter is called default constructor
           
class A{
    int a,b;
    
      void A(){
         
         a=10;
         b=20;
        System.out.println("a="+ a + "b="+b );
     }
    void show(){

        System.out.println("a+b=>"+(a+b));

    }
}
public class constructor{
    public static void main(String[] args) {
         A aa=new A();
          aa.A();
          aa.show();
    }
}

//2. parameterrized constructor
//defi::->a constructor through which we can pass  one or more parameters is called parameterrized constructor.
    
/*class A{

    int a,b;
   // Scanner sc=new Scanner(System.in);
    private Object system;

    public A(int a, int b)
    {
    
        this.a=a;
        this.b=b;

        System.out.println("a="+a+"b="+b);
    
    }
    void show(){

        System.out.println("a+b=>"+(a+b));

    }
}
 
public class constructor {
    public static void main(String[] args) {
        
        A aa=new A(10,20);

        System.out.println("a+"+aa.a+"b="+aa.b);
  
}
}*/

//copy constructor
//def::->Unlike other constructors copy constructor is passed 
//with another object which copies the data available from the 
//passed object to the newly created object.
 

/*class A{

    int a,b;
   // Scanner sc=new Scanner(System.in);

    public A(int a, int b)
    {
    
        this.a=a;
        this.b=b;

        System.out.println("a="+a+"b="+b);
    
    }
    void show()
    {
        system.out.println(a+" "+b);

    }
}
    A(A obj){
         
        this.a=obj.a;
        this.b=obj.b;
        System.out.println("a=>"+a+"\nb=>"+b);
    }
}
 
public class constructor {
    public static void main(String[] args) {
        
        A aa=new A(10,20);
        A aaa=new A(aa);
  }
}*/
