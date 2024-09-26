//find max array in java

import java.util.*;

public class maxarray 
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                
                int i,n,max=0,min=0;
                

                System.out.println("enter value of element=>");
                n=sc.nextInt();

                int a[]=new int[n];

                for(i=0; i<n; i++)
                  {
                        System.out.println("a["+i+"]");
                        a[i]=sc.nextInt();
                  }
                for(i=0; i<n; i++)
                   {
                        System.out.println("a["+i+"]:"+a[i]);
                     
                 if(a[i]>max)
                   {
                      max=a[i];
                   }  
                 if(a[i]<min);
                {
                    min=a[i];
                }  
            }
                System.out.println("is max number is==>"+max);
                System.out.println("is min number==>"+min);
        }    
}
