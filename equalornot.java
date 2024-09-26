//program for two array is equal or not

import java.util.*;

public class equalornot 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         
        int i,n;

         System.out.println("enter element size=>");
         n=sc.nextInt();

         int a[]=new int[n];
         int b[]=new int[n];

         for(i=0; i<n; i++)
           {
                System.out.print("a["+i+"]:");
                a[i]=sc.nextInt();
            }
         for(i=0; i<n; i++)
            {
                 System.out.println("a["+i+"]:");
                 b[i]=sc.nextInt();
             }


         

         //int a[]={2,3,4,5,6};

         //int b[]={4,5,7,8,2};

         
          boolean result=Arrays.equals(a,b);
              if(result==true)
                {
                    System.out.println("two arrays is equal");
                }
                else
                {
                    System.out.println("is not equal");
                }

            
    }
}
