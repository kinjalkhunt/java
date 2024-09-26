//merge two array

import java.util.*;

public class merge
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          
          int i,n,count=0;

          System.out.println("enter element of size==>");
          n=sc.nextInt();

          int a[]=new int[n];
          int b[]=new int[n];
          int c[]=new int[a.length+b.length];

          

          for(i=0; i<n; i++)
             {
                System.out.println("a["+i+"]:");
                a[i]=sc.nextInt();

                c[i]=a[i];
                count++;
             }
          for(i=0; i<n; i++)
            {
                  System.out.print("b["+i+"]:");
                  b[i]=sc.nextInt();

                  c[count++]=b[i];
            }  

            System.out.println("two  merge array is");
          for(i=0; i<c.length; i++)
            {
                System.out.print(c[i]+" ");
                //c[i]=sc.nextInt();
            }


     }   
}
