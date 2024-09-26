//use the keyword and pass the class object....final...and...static
import java.util.*;

  class A{
       static int year =2024;
      static void get(){
        System.out.println("jay shree ram");
        System.out.println("the year of est of ram mandir is=>"+year);

    }
}
    class B extends A{
        public void set(){
        
            System.out.println("jay shree krishna");
    
        }

    }

public class ram {
    public static void main(String[] args) {

        //A ram=new A();
        B gopal=new B();

         gopal.set();
        B.get();
    
    }
    
}

/*class A{
   static int a,b;
    
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
}*/