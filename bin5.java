//add two binary Strings
import java.util.*;

class bin5 
{
   public static void main(String[] args) {
      
        int sum=0,carry=0;
        int n1,n2,d1,d2,i;
        int[]a = new int[10];

        Scanner aa=new Scanner(System.in);

         System.out.print("enter first binary no=> ");
         n1=aa.nextInt();
         System.out.print("enter second binary no=> ");
         n2=aa.nextInt();
        
        for(i=a.length-1 ; i>=0 ;i--)
        {   
             d1=n1%10; 
             d1=n1/10;
             d2=n2%10;
             d2=n2/10;


             sum=d1+d2+carry;

             if(sum==0)
             {
                a[i]=0;
                carry=0;
             }
             else if(sum==1)
             {
                a[i]=1;
                carry=0;
             }
             else if(sum==2)
             {
                a[i]=0;
                carry=1;
             }
             else if(sum==3)
             {
                a[i]=1;
                carry=1;
             }
        } 

        for(i=0 ; i < a.length ; i++)
            {
                System.out.print(a[i]);
              }

            
    }
   

}

