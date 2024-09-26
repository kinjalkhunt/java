//to find prime number

import java.util.*;

public class prime
{
    public static void main(String[] args)
    
    {
        Scanner sc=new Scanner(System.in);

         int i,n,t=0;
            
        System.out.println("enter any number=>");
         n=sc.nextInt();

        for(i=2 ;i<=n-1 ;i++)
        {
            if(n % i==0)
            {
                t+=1;
            }
        }    
        if(t>0)

         {
            System.out.println("is prime number=>"+n);
         }
         else
         {
            System.out.println("is not prime number=>"+n);
         }
        }
    }


