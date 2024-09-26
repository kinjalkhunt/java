//find a neon number
import java.util.*;

public class neon 
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            int a,n,rev,sum=0;

            System.out.println("enter any one number");
            n=sc.nextInt();

            a=n*n;

            while(a>0)
            {
                rev=a%10;
                sum=sum+rev;
                a=a/10;
            }
            if(n==sum)
            {
                System.out.println("is neon number=>"+n);
            }
            else
            {
                System.out.println("is not neon number=>"+n);
            }
        }    
}
