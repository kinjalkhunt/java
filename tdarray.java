//add two matrix

import java.util.*;

public class tdarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, j, n;
    System.out.println("enter element of size==>");
    n = sc.nextInt();
    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int c[][] = new int[n][n];

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.println("a[" + i + "][" + j + "]");
        a[i][j] = sc.nextInt();
      }

    }

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.println("b[" + i + "][" + j + "]");
        b[i][j] = sc.nextInt();
      }

    }

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        c[i][j] = a[i][j] + b[i][j];

        System.out.print(c[i][j] + " ");
        // c[i][j]=sc.nextInt();
      }

    }
    System.out.println();
  }
}
