import java.util.*;

public class card2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, n, ans = 0;

    System.out.println("enter element of card=>");
    n = sc.nextInt();

    int cnum[] = new int[16];// ={4,4,5,6,7,8,9,1,5,7,3,2,1,3,5,6};

    for (i = 0; i < n; i++) 
    {
      System.out.println("a[" + i + "]:");
      cnum[i] = sc.nextInt();
        
        if (i % 2 == 0)
       {
            if(cnum[i] * 2 > 9)
            {
            ans += cnum[i] * 2 - 9;
            }
         else
            {
            ans += cnum[i] * 2;
            }
      }
      else
         {
           ans += cnum[i];
          }
   }

    System.out.println("ans = " + ans);
    if (ans % 10 == 0) {
      System.out.println("is valid card");
    } else {
      System.out.println("is not valid");
    }

  }
}