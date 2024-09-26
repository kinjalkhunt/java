import java.util.*;

public class mirrortolower {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size=>");
        int n=sc.nextInt();

        for(int i=n; i>=1; i--)
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
        for(int i=0; i<=n;i++)
        {
        for(int j=n;j>=i;j--)
            {
            System.out.print(" ");
            }
        for (int k=1;k<=i;k++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
}
}
