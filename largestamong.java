//largest among three number

import java.util.*;

public class largestamong 
{
    public static void main(String[] arg)
    
    {
        Scanner sc=new Scanner(System.in);
        
            int a,b,c,largest;

           System.out.println("enter value of a=>");
           a=sc.nextInt(); 
           System.out.println("enter value of b=>");
           b=sc.nextInt(); 

           System.out.println("enter value of c=>");
           c=sc.nextInt();
           

           largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 

           System.out.println("is max number is=>"+largest);
           /* if(a>b && a>c)
        
           {
              System.out.println("is max a="+a);
           
           }
           else if(b>a && b>c )
           {
            System.out.println("is max b="+b);
           
           }
           else
           {
            System.out.println("is max c="+c);
           }/* */
           
        
        
    }
}
