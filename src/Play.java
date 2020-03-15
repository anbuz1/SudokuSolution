public class Play {
    public static void main(String[] args) {
        int[][] table = {
                {0, 9, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4, 6, 0},
                {2, 0, 0, 0, 0, 0, 0, 0, 5},
                {0, 7, 0, 8, 0, 4, 0, 1, 0},
                {0, 3, 0, 0, 2, 0, 0, 0, 0},
                {5, 0, 0, 0, 6, 0, 8, 0, 0},
                {0, 1, 0, 7, 3, 0, 0, 2, 0},
                {9, 0, 8, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 0, 0, 0}};

        Sudoku sudoku = new Sudoku(table);
        sudoku.initSubsets();
        sudoku.solve();
        sudoku.print();

    }
}
