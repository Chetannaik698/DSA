public class NQueen {

    // public static void nQueenns(char board[][], int row) {

    // // base case
    // if (row == board.length) {
    // // printBoard(board);
    // count++;
    // return;
    // }

    // for (int j = 0; j < board.length; j++) {
    // if (isSafe(board, row, j)) {
    // board[row][j] = 'Q';
    // nQueenns(board, row + 1);
    // board[row][j] = 'x';
    // }
    // }
    // }

    public static boolean nQueenns(char board[][], int row) {

        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueenns(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; // backtracking
            }
        }

        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if (nQueenns(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        }else {
            System.out.println("Solution is not possible");
        }

        //This is for count
        // System.out.println("Total ways to solve n queens = " + count);
    }
}
