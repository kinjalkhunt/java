import java.util.*;

public class dice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int dice1, dice2, sum = 0;
        int rs = 100;

        System.out.println("welcome to dice game");
        System.out.println("follow this instroction");
        System.out.println("1.Until Your Balance Upto 60.Rs You Can Play The Game.");
        System.out.println(
                "2.Your Two Dise Of Sum And Your Guess Number Are 6 Than You Win 20.Rs Otherwise You Lose 20.Rs.");
        System.out.println(
                "3.Your Two Dise Of Sum And Your Guess Number Are Upto 6 & Down To And Both Are Same Than You  Win   10.Rs Othewise You Lose 10.Rs.");
        System.out.println("4.If Your Balance Less Than 60.Rs Than You Lose The Game.");
        System.out.println();
       
        System.out.print("Enter The Your Name:->");
        String name = sc.nextLine();
        int i;
        int a[] = new int[10];
        System.out.println("a[");

        for ( i = 0; i < 10; i++) {
            a[i] = rand.nextInt(1, 10);
            System.out.println(a[i] + ",");
        }

        System.out.println("]");

        for ( i = 0; i < a.length; i++) {
            if (rs > 60) {
                dice1 = rand.nextInt(1, 6);
                dice2 = rand.nextInt(1, 6);

                System.out.println("dice1 number is==>" + dice1);
                System.out.println("dice2 number is==>" + dice1);

                sum = dice1 + dice2;

                System.out.println("your total = " + sum);
                System.out.println(" ");

            }
            if (a[i] == 6 && sum == 6) {
                System.out.println("balance up to" + 20);
                rs = rs + 20;
                System.out.println("total=>" + rs);
                System.out.println(" ");
            } else if (a[i] > 6 && sum > 6 || a[i] < 6 && sum < 6) {

                System.out.println("balance is Up +10");
                rs = rs + 10;
                System.out.println("Total:->" + rs);

            } else if (a[i] > 6 && sum < 6 || a[i] < 6 && sum > 6) {

                System.out.println("balance is Down -10");
                rs = rs - 10;
                System.out.println("Total:->" + rs);

            } else if (a[i] != 6 || sum == 6 && a[i] == 6 || sum != 6) {

                System.out.println("Not Euqal -20");
                rs = rs - 20;
                System.out.println("Total:->" + rs);

            }

            else {

                System.out.println("Your Game Is Over....!");
                System.out.println("...opps..! You Loss The Game...):");
                break;

            }

        }
        sc.close();

        System.out.println("yapp....! Your Grand Total Is :->" + rs);

    }
}
