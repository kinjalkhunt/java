// programe to check leap year

import java.util.*;
public class leapy 
{
        public static void main(String[] args)

        {
             Scanner sc=new Scanner(System.in);

             System.out.println("enter year is=>");
             int i=sc.nextInt();

             if(i % 4==0)
             {
                System.out.println("is leap year=>"+i);

             }
             else
             {
                System.out.println("is not leap year=>"+i);
             }
        }
}
