//java program is symmetric or not 
import java.util.*;

public class symetric {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size=");
        String a = sc.nextLine();

        int n = a.length();
        boolean flag =true;
        int mid;

        if (n % 2 == 0) {
            mid = n / 2 ;
        } else {
            mid = (n / 2)+1;
        }

        int start1 = 0;
         int start2 = mid;
         System.out.println(n);

        while (start1 < mid)
        {
            System.out.println("Hello");
               if(a.charAt(start1) == a.charAt(start2)) {
                System.out.println(a.charAt(start1));
                 System.out.println(a.charAt(start2));

                start1 = start1 + 1;
                start2 = start2 + 1;
            } else {
                flag =false;
                break;
            }
        }

            
        if (flag) {
            System.out.println("is symemetric");
        } else {
            System.out.println("is not symmetric");
        }

    }

}
