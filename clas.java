import java.util.*;

class A{
    int a,b;
    
    Scanner sc=new Scanner(System.in);
    
    public void setter()
    {
        System.out.println("enter value a==>");
        int a=sc.nextInt();
        System.out.println("enter value a==>");
        int b=sc.nextInt();
    }
    public void getter()
    {
    
        System.out.println("a+"+a+"+b"+b);
        
        
     }
}
public class clas{

    public static void main(String[] args) {
        A aa=new A();
        aa.setter();
        aa.getter();
    }
    
}
