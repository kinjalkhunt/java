//remove duplicate element in array

import java.util.*;

public class remove 
{
    public static void main(String[] args)   
    {
        Scanner sc=new Scanner(System.in);

        int i,n,d;

        System.out.println("enter element of array=>");
        n=sc.nextInt();

        int a[]=new int[n];

        

        for(i=0; i<n; i++)
           {
                System.out.println("a["+i+"]:");
                a[i]=sc.nextInt();
           }
           System.out.println("enter location of element=>");
           d=sc.nextInt();
           {
            if(d>n+1)
              {
                    System.out.println("delet not possible");
              }
              else
              {
                  for(i=d-1; i<n-1; i++)
                     a[i]=a[i+1];
                    {
                        System.out.println("result aaray is=>");
                    }
              }
              for(i=0; i<n-1; i++)
               {
                  System.out.println(a[i]);
               }
           }
    }
}
