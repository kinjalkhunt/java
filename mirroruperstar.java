import java.util.*;
public class mirroruperstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        {
           System.out.println("Enter the number of size=>");
           int n=sc.nextInt();
           
           for(int i=0; i<=n; i++)
           {
            for(int j=n; j>=i; j--)
            {
             System.out.print(" ");

           }
           for(int k=1; k<=i; k++)
           {
            System.out.print("* ");
           }
           System.out.println();
        }
    }
    
}
}