
import java.util.Scanner; // Import the Scanner class from the java.util package.

public class Main { // Define a class named "TicTacToe."
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        initializeBoard(board);
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
}





