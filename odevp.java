//Java Program to Check Even or Odd Integers

import java.util.*;

public class odevp 
{
    public static void main(String[] args)  
    
    {
        Scanner p=new Scanner(System.in);
        int i;
        boolean r=true;
        boolean k=false;
        System.out.println("enter value is=>");
        i=p.nextInt();

        if(i%2==0)
        {
            System.out.println("is even=>"+r);
        }
        else
        {
            System.out.println("is odd=>"+k);
        }

    }
}
