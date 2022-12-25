package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i) || checkVertikal(board, i))) {
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

    private static boolean checkVertikal(int[][] board, int colomn) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][colomn] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
