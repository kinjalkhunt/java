import java.util.*;

public class swap 
{

    public static void main(String[] args)
    {
        int temp;
        Scanner b = new Scanner(System.in);
        System.out.println("enter value of x=");
        int x= b.nextInt();
        System.out.println("enter value of y=");
        int y= b.nextInt();
        System.out.println("before swaping ="+ x+" "+y);
        {
            temp=x;
               x=y;
               y=temp;
        }
        System.out.println("after swaping="+ x+" "+y);  

    }
}
