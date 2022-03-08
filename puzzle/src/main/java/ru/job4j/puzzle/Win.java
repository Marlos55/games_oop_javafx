package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] == 1){
                if(monoHorizontal(board, i) || monoVertical(board, i)){
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }


    public static boolean monoHorizontal(int[][] board, int row){
        boolean rst = true;
        for (int i = 0; i < board[row].length; i++) {
            if(board[row][i] != 1){
                rst = false;
                break;
            }
        }
        return rst;
    }


    public static boolean monoVertical(int[][] board, int column) {
        boolean rst = true;
        for (int i = 0; i < board.length - 1; i++) {
            if(board[i][column] != board[i + 1][column]){
                rst = false;
                break;
            }
        }
        return rst;

    }
}
