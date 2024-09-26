//spiral pattern

import java.util.*;

public class spiralpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

       // System.out.println("enter any value=>");
        //int n=sc.nextInt();
        int n=5;
        for(int i=1-n; i<n; i++)
        {
            for(int j=1-n; j<n; j++)
            {
                if(Math.abs(i)>Math.abs(j))
                {
                    System.out.print(" "+Math.abs(i)+1);
                }
                else
                {
                    System.out.print(" "+Math.abs(j)+1);
                }
            }
            System.out.println();
        }
    }   
}
