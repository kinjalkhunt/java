import java.util.*;

public class task1 {
   static int n = 9;

   // function to check if all element
   static boolean isRange(int[][] board) {

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (board[i][j] <= 0 || board[i][j] > 9) {
               return false;
            }
         }
      }
      return true;
   }
}