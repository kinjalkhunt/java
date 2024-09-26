//gcm and lcm number

import java.util.*;

public class gcdhcf 
{
      public static void main(String[] args)

      {
           Scanner sc=new Scanner(System.in);
            
           int a,b,g=0,i;
           System.out.println("enter value of a=>");
           a=sc.nextInt();
           System.out.println("enter value of b=>");
           b=sc.nextInt();
           
           for(i=1 ; i<=a ;i++)

           {
               if(a%i==0 && b%i==0)
                     
                      g=1;
           }

           //System.out.println(i);
           System.out.println("Gcd=>"+g);
      }


}
    

