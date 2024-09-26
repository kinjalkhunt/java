//to proramme by fibonacci use recursion 
import java.util.*;

public class fibonacci 
{
    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else{
            return (fibonacci(n-1)+fibonacci(n-2));
        }
    }
      
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value is=>");
        int k=sc.nextInt();

        int sum=0;
        for(int i=0; i<k;i++)
        {
            int f=fibonacci(i);
             sum += fibonacci(i);
        }
        System.out.println("a fibbonacii is=>"+sum);

    }
}
