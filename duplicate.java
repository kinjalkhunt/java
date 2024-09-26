
//remove duplicate elements of array
import java.util.*;

public class duplicate {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        int i, n;

        System.out.println("enter element of array=>");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }

        int p[] = new int[a.length];
        int j = 0;

        for (i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                p[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length - 1];

        for (i = 0; i < j + 1; i++) {
            System.out.println(a[i] + " ");
        }

    }

}
