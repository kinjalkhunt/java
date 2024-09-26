//passing object as aarguement/returning object
import java.util.*;

class A{
    int h,m,s;

    Scanner sc=new Scanner(System.in);

    public Object fahernhit;

    public double f;

    public double c;

    public void setter(){

        System.out.println("enter the second=>");
        s=sc.nextInt();
    }

    public void getter(){

        System.out.println("h:"+h+"m:"+m+"s:"+s);
    }

    public A calculate(A obj){
        
        A aa=new A();

        aa.h=s/3600+obj.s/3600;
        aa.m=s/60+obj.s/60;
        aa.s=s+obj.s;

        return aa;

        
    }
}

public class objectasaargue {

    public static void main(String[] args) {
        
        A aaa=new A();
        A bb=new A();

        aaa.setter();
        bb.setter();

        A a1=aaa.calculate(bb);
        a1.getter();
        
    }
    
}

/*class A{
    int a,b;
    static int z = 10;
     A(int x, int y){
        a = x;
        b = y;
        System.out.println("a="+ a + "b="+b + "z="+z);
    }


}
public class constructor{
    public static void main(String[] args) {

        A a1 =new A(40,20);
        A a2 =new A(30,70);
        //bb.show();
    }
}*/
