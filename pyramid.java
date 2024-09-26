import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=5;

        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)

            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
