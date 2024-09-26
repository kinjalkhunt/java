import java.util.*;

public class Sudoku {
    public static boolean ValidSudoku(int[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (!seen.add(num + " in row " + i) ||
                            !seen.add(num + " in column " + j) ||
                            !seen.add(num + " in subgrid " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // public static boolean innumRow(int[][] board, int rownum, int num) {
    // for (int j = 0; j < 9; j++) {
    // if (board[rownum][j] == num) {
    // return true;// number found the row
    // }
    // }
    // return false;// number not found the row
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] sudokuBoard = new int[9][9];
        System.out.println(
                "Enter the Sudoku board :::->");
        for (int i = 0; i < 9; i++) {
            String[] rowInput = sc.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudokuBoard[i][j] = Integer.parseInt(rowInput[j]);
            }
        }
        // int rownum = 1;// second row
        // int numToCheck = 5;
        // boolean isPresent =
        if (ValidSudoku(sudokuBoard)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
