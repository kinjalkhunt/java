
import java.util.*;
//ike we specified in the previous chapter; Inheritance lets us inherit 
//attributes and methods from another class. Polymorphism uses those 
//methods to perform different tasks. This allows us to perform a single action 
//in different ways.

class A{//A ni property override karva mate super key....overide programe 

    public double km;
    public Object mile;

    public void moye(){

        System.out.println("is class A");
    }
}
class B extends A{

    public void moye(){
        super.moye();

        System.out.println("is class B");
    }

    
}

public class polymorisam {

    public static void main(String[] args) {
        
    

   // A a=new A();
    B b=new B();
    
   // a.moye();
    b.moye();
    
}
}

/*class Apple{

    Scanner sc=new Scanner(System.in);

    String flavor,color;
    
    public void set(){

       System.out.println("enter apple flavor=>");
       this.flavor=sc.nextLine();

       System.out.println("enter apple color=>");
       this.flavor=sc.nextLine();
    }
}
class banana extends Apple{

    Scanner sc=new Scanner(System.in);

    String flavor,color;
    
    public void set(){

        super.set();

       System.out.println("enter banana flavor=>");
       this.flavor=sc.nextLine();

       System.out.println("enter banana color=>");
       this.flavor=sc.nextLine();
    }
}

public class polymorisam{
    
    public static void main(String[] args) {
        
          banana b=new banana();

          b.set();
    }
}*/

  
