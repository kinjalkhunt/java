import java.util.*;

public class guessing {
   public static void main(String[] args) {
      Random rand = new Random();

      int randomguess = rand.nextInt(1, 10);

      System.out.println("your challenging no. is 1 to 10=>"+randomguess);

      Scanner sc = new Scanner(System.in);

      int player1 = 0, player2 = 0, Try1=0,Try2 = 0;

      

      while(player1 != randomguess && player2 != randomguess) {



         System.out.println("enter player1 guessing no is=>");
         player1 = sc.nextInt();
         
         System.out.println("enter player2 guessing no is=>");         
         player2 = sc.nextInt();
   

         if (randomguess < player1) {
            System.out.println("no player1 you guess to high number...");
         } else if (randomguess > player2) {
            System.out.println("no player1 you guess to small number...");
         }
         

         if (randomguess < player2) {
            System.out.println("no player2 you guess to high number...");
         } else if (randomguess > player2) {
            System.out.println("no player2 you guess to low number...");
         } 
         
          
         //System.out.println("player1 try is=>" + Try);
         //System.out.println("player2 try is=>" + Try);

         if (player1==randomguess) {
            System.out.println("yes TRUE!...player 1 is winner.....");

         }
         else if (player2== randomguess ) {
            System.out.println("yes TRUE!...player 2 is winner.....");

         }
         else if(player1==randomguess && player2==randomguess){
            System.out.println("ohhh....both are win...game is tie...");

         }
                          
          //System.out.println(" ");
          //System.out.println("it took you"+ Try1 +"tries");
         // System.out.println("it took you"+ Try2 +"tries");
          


      }
   }
}

