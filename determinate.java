import java.util.*;

public class determinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        System.out.println("enter elements of array=>");
        n = sc.nextInt();

        int a[][] = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("after determinate=>");

        //for (i = 0; i < n; i++) {
           //     for (j = 0; j < n; j++) 
            {
                int determinant,x,y,z;
                x=(a[0][0] * (a[1][1] * a[2][2]
                               - a[1][2] * a[2][1]));
                y=(a[0][1] * (a[1][0] * a[2][2]
                               - a[1][2] * a[2][0]));
                z=(a[0][2] * (a[1][0] * a[2][1]
                               - a[1][1] * a[2][0]));
                determinant= x - y + z;
                System.out.println("The modulus of the given matrix is "+ determinant);
         
            }

                //System.out.println("determinate is=>" + det);
            }
        }
    