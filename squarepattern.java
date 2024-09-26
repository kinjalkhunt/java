//•	Java Program to Print Square Star Pattern
import java.util.*;
public class squarepattern {
    public static void main(String[] args) {
        
      
    Scanner sc=new Scanner(System.in);
    
    
        System.out.println("enter value=>");
        int n=sc.nextInt();
        
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=n;j++){
           
            if(i==0 || i==n || j==0 || j==n )

            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        
    }
}
    
}
