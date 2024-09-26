//pascals pattern
import java.util.*;

public class pascal 
{
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter any number=>");
        int n=sc.nextInt();

        int j,i,k,c=0;

        for(i=1; i<n; i++)
        {
            //int p=1;
            for(j=1; j<n-i-1; j++)
             {
                System.out.print("  ");
             }
             for(k=1; k<i+1; k++)
             {
                if( i==1||j==1)
                    {
                         c= 1;
                    }
                    else
                    {
                    
                         c=c*(i-k+1)+(k+1);
                    }
                    System.out.print(+c);
                }
                  System.out.println();

              }
    }
    
    }


