import java.util.*;

class A{

    double f,c;
    int n;
    Scanner sc=new Scanner(System.in);

    public void settemp(){

        System.out.print("enter the fahernhit=>");
        f=sc.nextFloat();
        System.out.print("enter the celsius=>");
        c=sc.nextFloat();
    }
    public A calculate(A obj){
        
        A aa=new A();

         aa.f= f + obj.f;
         aa.c= c + obj.c;

         System.out.println("sum of fahrenheit=> "+aa.f);
         System.out.println("sum of celsious=>"+aa.c);
         System.out.println();
         System.out.println("1.celsious to fahernheiht");
         System.out.println("2.fahrenheit to celcius");
         System.out.print("select your choice=>");
         n=sc.nextInt();
        // System.out.println(n);

        switch (n) {

          case 1:
                f=(aa.c*1.8)+32;
                System.out.println("celsius to fehrenheit=>"+f);
                break;
           case 2:
                c=(aa.f-32)*0.55;
                System.out.println("fahernheit to celsius=>"+c);     
                break;
            
                default:
                System.out.println("envalid input");
                break;
        }
            return aa;

    }
}
public class ferhenit {

    public static void main(String[] args) {
        
        A bb=new A();
        A b1=new A();
        A b2=new A();

        bb.settemp();
        b1.settemp();
        b2=bb.calculate(b1);
    }
    
}

