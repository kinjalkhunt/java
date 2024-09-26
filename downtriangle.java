// triangle pattern 

import java.util.*;

public class downtriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        //System.out.println("enter any number=>");
       // int n=sc.nextInt();

        for(int i=5;i>=1;i--)
          {
            
            for(int j=i;j<=5;j++)
         
             {  
                System.out.print(" ");
             }
             for(int k=i;k<=(i*2)-1;k++)
             {
                System.out.print("* ");
             }
             System.out.println();
          }
    }   
}
