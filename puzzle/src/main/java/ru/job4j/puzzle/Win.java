package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 1 && (checkHorizont(board, row) || checkVertical(board, cell))) {
                    rsl = true;
                }
            }
        }
        return rsl;
    }

    public static boolean checkHorizont(int[][] board, int row) {
        boolean result = false;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] == 1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int cell) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] == 1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


}
