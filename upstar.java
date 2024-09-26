//diamond triangle pattern

import java.util.*;


public class upstar 
{
    
        public static void main(String[] arg) 
        {
            Scanner sc=new Scanner(System.in);
        
    
      for(int i=1; i<=5;i++)
      {
        for(int j=5; j>=i;j--)
        {
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print("2 ");
        }
        System.out.println();
    }

        for(int i=5; i>=1;i--)
      {
        for(int j=i; j<=5;j++)
        {
        System.out.print(" ");
        }
        for(int k=i;k<=(i*2)-1;k++)
        {
            System.out.print("1 ");
        }


        System.out.println();        
      } 
        
   }
}
