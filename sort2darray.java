//java programe to sort 2d array

import java.util.*;

public class sort2darray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int i,j,n;

        System.out.println("enter element of array=>");
        n=sc.nextInt();

        int a[][] = new int[n][n]; 

         for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
              {
                  System.out.print("a["+i+"]["+j+"]=");
                  a[i][j]=sc.nextInt();  
              }  
             
         }
          for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
              {
                  System.out.print(a[i][j]+" ");
                  // a[i][j]=sc.nextInt();  
              }  
             System.out.println();
         }

         //comparator(int) c=new comparator();
          for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
              {
                for(int k=j+1; k<n ; k++) 
                  {
                    if(a[i][j]>a[i][k])
                    {
                      int temp=a[i][j];
                      a[i][j]=a[i][k];
                      a[i][k]=temp;
                    }
                  }  
              }
        } 
        System.out.println("sorted element is=>");
         for(i=0 ; i<n ; i++)
         {
            for(j=0 ; j<n ; j++)
              {
                  System.out.print(a[i][j]+" ");
                   
              }  

              System.out.println();
             
         }

   

    }
}
    

