import java.util.*;

public class guessing2 {

    public static void main (String [] arrgs) {

    Random guess= new Random();
    Scanner sc = new Scanner(System.in);

    int random = guess.nextInt(1,100);
    System.out.print("Enter Any Numbers Between 1 To 100....");
    int p1try = 0;
    int p2try = 0;
    System.out.println();

     System.out.print("Enter The first Player:->");
    int player1 = sc.nextInt();
    System.out.print("Enter The Second Player:->");
    int player2 = sc.nextInt();

    while(true) {

        p1try ++;
        
        if (random< player1)  {

            System.out.println("..No You Should Try Lower Number...!");

        }
        else if (random > player1)  {

            System.out.println("..No You Should Try Bigger Number...!");

        }
        else {

            System.out.println(":)..Yaappp...! You Guess Right Number...(:");
        

        }
        break;

    }
   


    System.out.println();
    System.out.print("Enter Any Numbers Between 1 To 100....");
    while ( true) {

        p2try ++;
        
        if ( random <player2)  {

            System.out.println("..No You Should Try Lower Number...!");

        }
        else if (random > player2)  {

            System.out.println("..No You Should Try Bigger Number...!");

        }
        else {

            System.out.println(":)..Yaappp...! You Guess Right Number...(:");
            

        }
        break;

    }

    System.out.println("player 1 Tryle :->" + p1try);
    System.out.println("player 2 Tryle :->" + p2try);

    if (p1try < p2try) {

        System.out.println("player 1 Is Winner");

    }
    else if (p1try > p2try) {

        System.out.println("player 2 Is Winner");

    }
    else {

        System.out.println("....The Game Ended In Draw....");

    }
    
    
  }

}
