//program to sort an array in ascending and decending order

import java.util.*;

public class sorta 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int i,j,n,temp=0;

        System.out.println("enter value of array size==>");
        n=sc.nextInt();

        int a[]=new int[n];

        for(i=0; i<n; i++)
          {
              System.out.println("a["+i+"]:");
              a[i]=sc.nextInt();
          }
        for(i=0; i<n; i++)
          {
             System.out.println("a["+i+"]:"+a[i]);
            for(j=i; j<n; j++)
            {
                if(a[i] > a[j])//ascending order code if(a[i] < a[j]) decending order
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
          }
          System.out.println("ascending number is");

          for(i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
    }   
}
