//to find factorial number

import java.util.*;

public class fact
{
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            
            int fact=1,n,i;
            System.out.println("enter number is=>");
            n=sc.nextInt();

            for(i=1 ; i<=n ; i++)
            {
                fact=fact*i;
            }
            System.out.println("factorial number is=>"+fact);
      }   
}
