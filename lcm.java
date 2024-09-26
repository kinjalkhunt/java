//to find lcm number

import java.util.*;

public class lcm 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a,b,g=0,lcm;

        System.out.println("enter one number=>");
        a=sc.nextInt();
        System.out.println("enter one number=>");
        b=sc.nextInt();

        for(int i=1 ; i<=a ; i++) 
            {
                if(a%i==0 && b%i==0)
                  {
                    g=1;
                  }

            }
            lcm=a*b/g;

            System.out.println("lcm="+lcm);
    }    
}
