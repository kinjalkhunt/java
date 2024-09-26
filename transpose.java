//to find transpose matrix

import java.util.*;

public class transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int i,j,n;

        System.out.println("enter element of array=>");
        n=sc.nextInt();

        int a[][]=new int[n][n];
        
        for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
                
            {
                System.out.println("a["+i+"]["+j+"]=>");
                a[i][j]=sc.nextInt();
            }
            System.out.println();
         }
         for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
                
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
         }

         int t[][]=new int[n][n];
        
         for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
                
            {
                
                a[i][j]=t[j][i];
            }
            System.out.println();
         }
         for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
                
            {
                System.out.println(t[i][j]+" ");
                
            }
         }
         System.out.println();
    }   
}
