
//single inheritance
import java.util.*;

/*class A {
    int a, b;
    public void set() {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a=>");
        a = sc.nextInt();
        System.out.println("enter value of b=>");
        b = sc.nextInt();
    }
    public void get() {
        System.out.println("a=" + a + "\nb=" + b);
    }
}
class B extends A {
    public void sum() {
        System.out.println("a+b=>" + (a + b));
    }
}
public class inheri {
    public static void main(String[] args) {
        B bb = new B();
        bb.set();
        bb.get();
        bb.sum();
    }
}*/
//multileval inheritence

/*class Dada {
    int a, b;
    Scanner sc = new Scanner(System.in);
    
     void set()//public or abstract method 
     {
    
        System.out.println("enter value of a=>");
        a = sc.nextInt();
        System.out.println("enter value of b=>");
        b = sc.nextInt();
    }

}
class papa extends Dada {
    
 void get() {
        //Scanner sc=new Scanner(System.in);

        System.out.println("a+"+a+"b"+b);
        
        }
}
class beta extends papa {
    
    public void mul() {
        
            System.out.println("a+b=>"+(a+b));
            System.out.println("x*y=>"+(a*b));

        }
}
public class inheri {
    public static void main(String[] args) {
        beta bb = new beta();
        
        bb.set();
        bb.get();
        bb.mul();

    }
}*/

//hiraichical inheritance....

/*class Dada {
    int a, b;
    Scanner sc = new Scanner(System.in);
    
     void set()//public or abstract method 
     {
    
        System.out.println("enter value of a=>");
        a = sc.nextInt();
        System.out.println("enter value of b=>");
        b = sc.nextInt();
    }

}
class papa extends Dada  {
    
 void get() {
        //Scanner sc=new Scanner(System.in);

        System.out.println("a+"+a+"b"+b);
        
        }
}
class beta extends Dada {
    
    public void mul() {
        
            System.out.println("a+b=>"+(a+b));
            System.out.println("x*y=>"+(a*b));

        }


}
public class inheri {
    public static void main(String[] args) {
        beta bb = new beta();
        
       // bb.set();
        bb.set();
        bb.mul();

    }
}*/

//multiple inheritance

 /*  interface animal{

    //String sound;
    //Scanner sc=new Scanner(System.in);
    
    public void sound();
    
}
 interface donky {

     public void sleep();
}
class sparrow implements animal,donky{
  public void sound(){
    System.out.println("sound is...");
  }
  public void sleep(){
    System.out.println("sleep is...");
  }
   public void fly(){

        System.out.println("sparrow is flying...");

    }
}
public class inheri {
    public static void main(String[] args) {
        sparrow b = new sparrow();
        
        b.fly();
        b.sound();
        b.sleep();

    }
}*/

//hybrid inheritance
      
class A{

   // int a,b;

    //Scanner sc=new Scanner(System.in);

    void set(){

        System.out.println("this is message for a class...");
       // a=sc.nextInt();
        //b=sc.nextInt();
    }


}
interface B {

    public void show();
}
interface C {

    public void show();
}

class D extends A implements B,C{

    public void show()
    {
        System.out.println("Implementation of show() method defined in interfaces B and cor extend of A");
    }
    public void sub(){

        System.out.println("impliments of hybrid inheritense");
    }

}
public class inheri {
    public static void main(String[] args) {
         D b = new D();
        System.out.println("hiiiiii........");
        b.show();
        b.sub();
    

    }
}
    


    



