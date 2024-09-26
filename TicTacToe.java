// import java.util.*;

// public class TicTacToe {
//     private static char[][] board = new char[3][3];
//     private static char currentPlayer = 'X';

//     public static void main(String[] args) {
//         initializeBoard();
//         printBoard();
//         playGame();
//     }

//     private static void initializeBoard() {
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 board[i][j] = '-';
//             }
//         }
//     }

//     private static void printBoard() {
//         System.out.println("-------------");
//         for (int i = 0; i < 3; i++) {
//             System.out.print("| ");
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(board[i][j] + " | ");
//             }
//             System.out.println();
//             System.out.println("-------------");
//         }
//     }

//     private static void playGame() {
//         Scanner scanner = new Scanner(System.in);
//         boolean gameEnded = false;

//         while (!gameEnded) {
//             System.out.println("Player " + currentPlayer + "'s turn. Enter row (0-2) and column (0-2) separated by space:");
//             int row = scanner.nextInt();
//             int col = scanner.nextInt();

//             if (isValidMove(row, col)) {
//                 board[row][col] = currentPlayer;
//                 printBoard();
//                 if (checkWin()) {
//                     System.out.println("Player " + currentPlayer + " wins!");
//                     gameEnded = true;
//                 } else if (isBoardFull()) {
//                     System.out.println("It's a draw!");
//                     gameEnded = true;
//                 } else {
//                     currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//                 }
//             } else {
//                 System.out.println("Invalid move! Try again.");
//             }
//         }
//         scanner.close();
//     }

//     private static boolean isValidMove(int row, int col) {
//         return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
//     }

//     private static boolean checkWin() {
//         // Check rows, columns, and diagonals for a win
//         return (checkRows() || checkColumns() || checkDiagonals());
//     }

//     private static boolean checkRows() {
//         for (int i = 0; i < 3; i++) {
//             if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
//                 return true;
//             }
//         }
//         return false;
//     }

//     private static boolean checkColumns() {
//         for (int i = 0; i < 3; i++) {
//             if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
//                 return true;
//             }
//         }
//         return false;
//     }

//     private static boolean checkDiagonals() {
//         return (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') ||
//                 (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-');
//     }

//     private static boolean isBoardFull() {
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (board[i][j] == '-') {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
 
public class TicTacToe{
    public static void main(String[] args) {
        
        int a=10,b=20;

        if (a++>=10 || ++b <20){
            System.out.println("a+b"+(a+b));
        }
    }
}