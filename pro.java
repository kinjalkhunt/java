import java.util.*;

class pro

{
     public static void main(String[] args)
    {
        Scanner p= new Scanner(System.in);

        int a,b,max,min;

        
        System.out.println("enter value of a=");
        a=p.nextInt();
        System.out.println("enter value of b=");
        b=p.nextInt();

        max=((a+b)+Math.abs(a-b))/2;
        //min=(a+b)-Math.abs(a-b)/2;

        System.out.println("maximum value is=>"+max);
       // System.out.println("maximum value is=>"+min);

    }
}

