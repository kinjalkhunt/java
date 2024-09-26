//to find left and right half triangle and triangle pattern

import java.util.*;

public class pat1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=5;i++)
          {
                for(int j=5;j>=1;j--)
                 {
                 if(j<=i)//(i<=j)
                 {
                    System.out.print("* ");
                 }
                 else
                 {
                    System.out.print(" ");
                 }
                
               }                 
               System.out.println();
         
              }    
            }
}
  
