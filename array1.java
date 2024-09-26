//search an element of array

import java.util.*;

public class array1 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        int i, n;
        System.out.println("enter value of n=>");
        n = sc.nextInt();

        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]:" + a[i]);
        }
    }

}
