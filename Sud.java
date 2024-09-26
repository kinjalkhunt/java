public class new{public class Sud
        public static void main(String[] args) {
            int[][] sudokuGrid = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
            };
    
            // Example usage
            int[] row3 = getRow(sudokuGrid, 2);
            int[] column7 = getColumn(sudokuGrid, 6);
    
            System.out.println("Row 3: " + Arrays.toString(row3));
            System.out.println("Column 7: " + Arrays.toString(column7));
        }
    
        // Function to get a specific row
        public static int[] getRow(int[][] grid, int rowIndex) {
            return grid[rowIndex];
        }
    
        // Function to get a specific column
        public static int[] getColumn(int[][] grid, int colIndex) {
            int[] column = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][colIndex];
            }
            return column;
        }
    }

}
