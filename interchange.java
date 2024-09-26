//program by row interchange in matrix

import java.util.*;

public class interchange 

{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        int i,j,n;

        System.out.println("enter element of array=>");
        n=sc.nextInt();

        int a[][]=new int[n][n];

        System.out.println("withot interchange matrix=>");
        for(i=0 ; i<n ; i++)
          {
             for(j=0; j<n ; j++)

                {
                    System.out.println("["+i+"]["+j+"]=>");
                    a[i][j]=sc.nextInt();
                }
                System.out.println();
          }
          for(i=0 ; i<n ; i++)
          {
             for(j=0; j<n ; j++)

                {
                    System.out.println(a[i][j]+" ");
                    
                }
                System.out.println();
          }

           i=a.length;
           for(i=0 ; i<a[0].length ; i++)
           
          {
            int temp = a[0][i];
            a[0][i] = a[i - 1][i];
            a[i - 1][i] = temp;
          }
          System.out.print("after interchange matrix");

          for(i=0 ; i<n ; i++)
          {
             for(j=0; j<n ; j++)

                {
                    System.out.println(a[i][j]+" ");
                    
                }
                System.out.println();
          }

        
    }
    }
    

    

