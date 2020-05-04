 //1. You are given a number n, the size of a chess board.
//2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
//Note - Queens kill at distance in all 8 directions
//3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens
//Use sample input and output to get more idea.




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];

        printNQueens(chess, "", 0);
        System.out.println();
    }
    public static boolean isQueensafe(int chess[][], int row, int col) {

        //upper left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        //col
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        //upper right
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }


        for (int col = 0; col < chess[0].length; col++) {

            if (isQueensafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;

            }


        }
    }
}




//input-4
//output-
//       0-1, 1-3, 2-0, 3-2, .
//       0-2, 1-0, 2-3, 3-1, .
