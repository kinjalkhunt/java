//this program to check of datatype
import java.util.*;

public class datatype 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a;
        char b;
        String str;

        System.out.println("enter string value=>");
        str=sc.nextLine();

        System.out.println("enter integer value=>");
        a=sc.nextInt();

        System.out.println("enter charactor value=>");
        b=sc.next().charAt(0);

        System.out.println(a + " is of type " + ((Object)a).getClass().getSimpleName());
        System.out.println(b + " is of type " + ((Object)b).getClass().getSimpleName());  
        System.out.println(str + " is of type " + ((Object)str).getClass().getSimpleName());  
}
}
