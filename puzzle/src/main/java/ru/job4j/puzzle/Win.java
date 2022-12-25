package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i) || checkVert(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
    private static boolean checkHorizontal(int[][] board, int row) {
        boolean rsl = true;
            for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != 1) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }

    private static boolean checkVert(int[][] board, int col) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
